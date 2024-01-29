package com.flutter.base.dao;

import java.sql.Timestamp;
import java.util.List;


import com.flutter.base.model.KKG_Dto01_forAnswer;
import com.flutter.base.model.KKG_Dto02_forSurvey;

public interface KKG_Dao01_rsList {

	List<KKG_Dto01_forAnswer> getCardioList(String uid);

	List<KKG_Dto01_forAnswer> getDiamentiaList(String uid);

	List<KKG_Dto01_forAnswer> getDiabetesList(String uid);

	List<KKG_Dto02_forSurvey> getDetailList(String uid, Timestamp iDate);

	List<KKG_Dto01_forAnswer> getWholeList(String uid);
	

}
