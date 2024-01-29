package com.flutter.base.dao;

import java.sql.Timestamp;
import java.util.List;

import com.flutter.base.model.Dto_00_survey;

public interface Dao_00_survey {

	List<Dto_00_survey> getSurvey01();

	List<Dto_00_survey> getSurvey03();

	List<Dto_00_survey> getSurvey02();

	List<Dto_00_survey> save(String uid, String sSeq, String answer, String result, String category, Timestamp ts);

}
