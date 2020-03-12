package com.banhoctap.service;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.Collections;

import org.springframework.stereotype.Service;

import com.bht.core.DriverConnector;
import com.bht.core.Utilities;
import com.google.api.client.http.FileContent;
import com.google.api.services.drive.model.File;

@Service
public class DocumentService {

	public boolean uploadFile(String savePath,String filename, String contentType, byte[] data) {
		
		String folderId = Utilities.ROOT_FOLDER;
        
        //JRE1.7
        switch (contentType) {
		case Utilities.TEXT_TYPE:
			folderId = Utilities.TEXT_FOLDER;
			break;

		case Utilities.PDF_TYPE:
			folderId = Utilities.PDF_FOLDER;
			break;
		
		case Utilities.POWERPOINT_TYPE:
			folderId = Utilities.POWERPOINT_FOLDER;
			break;
			
		default:
			System.out.println("content type not suport");
			return false;
		}
        
        System.out.println(savePath);
        
        //byte[] bytes = file.getBytes();  
        BufferedOutputStream stream;
		try {
			java.io.File fileSaveInServer = new java.io.File(savePath);
			stream = new BufferedOutputStream(new FileOutputStream(  
			     fileSaveInServer));
			 stream.write(data);  
		        stream.flush();  
		        stream.close(); 

		File fileMetadata = new File();
		fileMetadata.setName(filename);
		fileMetadata.setParents(Collections.singletonList(folderId));
		
		FileContent mediaContent = new FileContent(contentType, fileSaveInServer);
		File fileUploadDriver = DriverConnector
				.getDriverService()
				.files()
				.create(fileMetadata, mediaContent)
				.setFields("id, parents")
				.execute();
		
		System.out.println("File ID: " + fileUploadDriver.getId());

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (IOException e) {
			e.printStackTrace();
			return false;
		} catch (GeneralSecurityException e) {
			e.printStackTrace();
			return false;
		} 
		
		
		//insert to DB here ============================================
		
		return true;
	}
}
