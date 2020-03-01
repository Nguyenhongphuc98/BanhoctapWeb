package com.banhoctap.dalimp;

import java.sql.Timestamp;
import java.util.List;

import com.banhoctap.entity.BHTComment;

public interface CommentImp {

	boolean saveComment(BHTComment comment);
	
	boolean deleteComment(BHTComment comment);
	
	List<BHTComment> fetchAllCommentsOfPost (int postID);
	
	List<BHTComment> fetchAllCommentsOfUser (int userID);
	
	//Filter nào không có thì ta truyền null vào. Trong hàm sẽ tự động xem là không dùng filter đó.

	List<BHTComment> fetchAllCommentWithFilter (Integer commentID, Integer userID, Integer postID,
			Boolean commentSoftDeleted, Boolean commentHidden, Boolean commentApproved,
			String commentContentURL, Integer parentCommentID, Timestamp commentDtm);
	
}
