package com.banhoctap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "Semester")
public class BHTSemester {

	@Id
	@Column(name = "SemesterID")
	int id;
	
	@Column(name = "AcademicYear")
	String year;
	
	@Column(name = "SemesterNo")
	String no;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}
}
