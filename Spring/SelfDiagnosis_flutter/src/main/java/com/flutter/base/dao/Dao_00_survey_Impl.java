package com.flutter.base.dao;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.flutter.base.model.Dto_00_survey;

public class Dao_00_survey_Impl implements Dao_00_survey {
	
	SqlSession sqlSession;
	public String nameSpace = "com.flutter.base.dao.Dao_00_survey";

	@Override
	public List<Dto_00_survey> getSurvey01() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace+".getSurvey01");
	}

	@Override
	public List<Dto_00_survey> getSurvey03() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace+".getSurvey03");
	}

	@Override
	public List<Dto_00_survey> getSurvey02() {
		// TODO Auto-generated method stub
		return sqlSession.selectList(nameSpace+".getSurvey02");
	}

	@Override
	public List<Dto_00_survey> save(String uid, String sSeq, String answer, String result, String category, Timestamp ts) {
		

		return sqlSession.selectList(nameSpace+".save");
	}

}
