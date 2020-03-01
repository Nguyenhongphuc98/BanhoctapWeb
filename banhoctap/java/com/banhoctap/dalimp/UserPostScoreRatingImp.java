package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTUserPostScoreRating;

public interface UserPostScoreRatingImp {
	
	boolean saveUserPostScoreRating (List<BHTUserPostScoreRating> userPostScoreRatings);
	
	boolean deleteUserPostScoreRating();
	
	boolean deleteUserPostScoreRating (BHTUserPostScoreRating userPostScoreRating);
	
	List<BHTUserPostScoreRating> fetchUserPostScoreRatings ();
	
	List<BHTUserPostScoreRating> fetchUserPostScoreRatingsDescending();
	
	List<BHTUserPostScoreRating> fetchUserPostScoreRatingAscending();
	
}
