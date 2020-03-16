package com.banhoctap.controller;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.banhoctap.entity.BHTDocument;
import com.banhoctap.entity.BHTPost;
import com.banhoctap.service.DocumentService;
import com.bht.core.DriverConnector;
import com.bht.core.Utilities;
import com.google.api.client.http.FileContent;
import com.google.api.services.drive.Drive;

import com.google.api.services.drive.model.File;
import com.google.api.services.drive.model.FileList;

@Controller
@RequestMapping("/documents")
public class DocumentController {
	
	@Autowired
	DocumentService documentService;
	
	@GetMapping
	public String documentHome(ModelMap modelMap) {
		List<BHTDocument> docs= documentService.fetchAllDocuments();
		modelMap.addAttribute("documents", docs);
		return "documenthome";
	}
	
	@GetMapping(path = "/fetchbytitle/{title}")
	public String documentHome(@PathVariable("title") String docTitle, ModelMap modelMap) {
		List<BHTDocument> docs= documentService.fetchDocumentsByTitle(docTitle);
		modelMap.addAttribute("documents", docs);
		return "documenthome";
	}
	
	@GetMapping(path = "/topndownload/{topN}")
	public String documentHome(@PathVariable("topN") int topN, ModelMap modelMap) {
		List<BHTDocument> docs= documentService.fetchDocumentsTopNDownload(topN);
		modelMap.addAttribute("documents", docs);
		return "documenthome";
	}

	@GetMapping("/upload")
	public String getUploadPage() {

		return "upload";
	}
	
	@PostMapping("/upload")
	@ResponseBody
	public String uploadDoc(@RequestParam CommonsMultipartFile file, @RequestParam("title") String title, HttpSession session) {
		
		String path = session.getServletContext().getRealPath("/");
		String filename = file.getOriginalFilename();
		String savePath = path + "\\uploadDir\\" + filename;
		System.out.println(title);
		String contentType = file.getContentType();
		
		if (documentService.uploadFile(savePath, filename, contentType, file.getBytes()) == true)
			return "upload post";
		else
			return "fail upload";
	}

}
