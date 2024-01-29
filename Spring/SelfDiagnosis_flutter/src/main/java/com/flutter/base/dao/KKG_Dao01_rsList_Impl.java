package com.flutter.base.dao;

import java.sql.Timestamp;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.json.simple.JSONObject;

import com.flutter.base.model.KKG_Dto01_forAnswer;
import com.flutter.base.model.KKG_Dto02_forSurvey;

public class KKG_Dao01_rsList_Impl implements KKG_Dao01_rsList {
	
	SqlSession sqlSession;
	public String nameSpace = "com.flutter.base.dao.KKG_Dao01_rsList";
	
	@Override
	public List<KKG_Dto01_forAnswer> getCardioList(String uid) {
		
		return sqlSession.selectList(nameSpace+".getCardioList");
	}
	
	@Override
	public List<KKG_Dto01_forAnswer> getDiabetesList(String uid) {
		
		return sqlSession.selectList(nameSpace+".getDiabetesList");
	}
	
	@Override
	public List<KKG_Dto01_forAnswer> getDiamentiaList(String uid) {
		
		return sqlSession.selectList(nameSpace+".getDiamentiaList");
	}

	@Override
	public List<KKG_Dto02_forSurvey> getDetailList(String uid, Timestamp iDate) {
		return sqlSession.selectList(nameSpace+".getDetailList");
	}

	@Override
	public List<KKG_Dto01_forAnswer> getWholeList(String uid) {
		return sqlSession.selectList(nameSpace+".getWholeList");
	}
	



}
