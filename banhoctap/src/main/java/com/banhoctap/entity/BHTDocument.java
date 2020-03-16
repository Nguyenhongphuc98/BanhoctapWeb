package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "Document")
public class BHTDocument {

	@Id
	@Column(name = "DocumentID")
	int id;
	
	@Column(name = "DocumentTitle")
	String title;
	
	@Column(name = "DocumentDescription")
	String description;
	
	@OneToOne
	@JoinColumn(name = "DocumentUploaderUserID")
	BHTUserAccount uploader;
	
	@Column(name = "DocumentPublicURL")
	String publicUrl;

	@Column(name = "DocumentContentURL")
	String contentUrl;
	
	@Column(name = "DocumentSoftDeleted")
	boolean isSoftDeleted;
	
	@Column(name = "DocumentHidden")
	boolean isHidden;
	
	@Column(name = "DocumentApproved")
	boolean isApproved;
	
	@Column(name = "DocumentViewCount")
	int views;
	
	@Column(name = "DocumentDownloadCount")
	int downloads;
	
	@OneToOne
	@JoinColumn(name = "SemesterID")
	BHTSemester semeter;
	
	@OneToOne
	@JoinColumn(name = "SubjectID")
	BHTSubject subject;
	
	@OneToOne
	@JoinColumn(name = "DocumentCategoryID")
	BHTDocumentCategory category;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BHTUserAccount getUploader() {
		return uploader;
	}

	public void setUploader(BHTUserAccount uploader) {
		this.uploader = uploader;
	}

	public String getPublicUrl() {
		return publicUrl;
	}

	public void setPublicUrl(String publicUrl) {
		this.publicUrl = publicUrl;
	}
	
	public String getContentUrl() {
		return contentUrl;
	}

	public void setContentUrl(String contentUrl) {
		this.contentUrl = contentUrl;
	}

	public boolean isSoftDeleted() {
		return isSoftDeleted;
	}

	public void setSoftDeleted(boolean isSoftDeleted) {
		this.isSoftDeleted = isSoftDeleted;
	}

	public boolean isHidden() {
		return isHidden;
	}

	public void setHidden(boolean isHidden) {
		this.isHidden = isHidden;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getDownloads() {
		return downloads;
	}

	public void setDownloads(int downloads) {
		this.downloads = downloads;
	}

	public BHTSemester getSemeter() {
		return semeter;
	}

	public void setSemeter(BHTSemester semeter) {
		this.semeter = semeter;
	}

	public BHTSubject getSubject() {
		return subject;
	}

	public void setSubject(BHTSubject subject) {
		this.subject = subject;
	}

	public BHTDocumentCategory getCategory() {
		return category;
	}

	public void setCategory(BHTDocumentCategory category) {
		this.category = category;
	}
}
