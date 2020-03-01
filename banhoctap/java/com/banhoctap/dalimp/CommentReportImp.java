package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTCommentReport;

public interface CommentReportImp {

	boolean saveCommentReport (BHTCommentReport commentReport);
	
	boolean deleteCommentReport (BHTCommentReport commentReport);
	
	List<BHTCommentReport> fetchCommentReports ();
	
	List<BHTCommentReport> fetchCommentReportsOfUser (int userReportID);
	
	List<BHTCommentReport> fetchCommentReportsOfReportedUser (int reportedUserID);
	
	//Filter nào không có thì ta truyền null vào. Trong hàm sẽ tự động xem là không dùng filter đó.
	List<BHTCommentReport> fetchCommentReportWithFilter (int commentReportID, int commentID, 
			int userReportID, int reportedUserID, boolean commentReportSolved);
	
}
