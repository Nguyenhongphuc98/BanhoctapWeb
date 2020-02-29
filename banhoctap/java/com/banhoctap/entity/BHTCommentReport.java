package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "CommentReport")
public class BHTCommentReport {

	@Id
	@Column(name = "CommentReportID")
	int id;
	
	@OneToOne
	@JoinColumn(name = "CommentID")
	BHTComment comment;
	
	@OneToOne
	@JoinColumn(name = "UserReportID")
	BHTUserAccount userReport;
	
	@OneToOne
	@JoinColumn(name = "ReportedUserID")
	BHTUserAccount reportedUser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BHTComment getComment() {
		return comment;
	}

	public void setComment(BHTComment comment) {
		this.comment = comment;
	}

	public BHTUserAccount getUserReport() {
		return userReport;
	}

	public void setUserReport(BHTUserAccount userReport) {
		this.userReport = userReport;
	}

	public BHTUserAccount getReportedUser() {
		return reportedUser;
	}

	public void setReportedUser(BHTUserAccount reportedUser) {
		this.reportedUser = reportedUser;
	}
}
