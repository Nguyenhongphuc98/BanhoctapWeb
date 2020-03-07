package com.banhoctap.dalimp;

import java.util.List;

import com.banhoctap.entity.BHTBannedWord;

public interface BannedWordImp {

	boolean saveBannedWord (BHTBannedWord bannedWord);
	
	boolean deleteBannedWord (BHTBannedWord bannedWord);
	
	List<BHTBannedWord> fetchAllBannedWords ();
	
	boolean checkWordBanned (String word);
	
	boolean checkParagraphContainsBadWords (String paragraph);
	
}
