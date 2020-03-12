package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTSubject;

public interface SubjectImp {

	boolean saveSubject(BHTSubject subject);
	
	boolean deleteSubject(BHTSubject subject);
	
	List<BHTSubject> fetchSubjects();
	
	List<BHTSubject> fetchSubjectsByName (String subjectName);
}
