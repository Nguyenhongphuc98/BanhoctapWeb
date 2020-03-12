package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTSemester;

public interface SemesterImp {
	
	boolean saveSemester (BHTSemester semester);
	
	boolean deleteSemester (BHTSemester semester);
		
	List<BHTSemester> fetchSemesters ();
	
	List<BHTSemester> fetchSemestersByAcademicYear (String academicYear);
}
