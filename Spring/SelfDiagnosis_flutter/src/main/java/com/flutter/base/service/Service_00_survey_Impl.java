package com.flutter.base.service;

import java.sql.Timestamp;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flutter.base.dao.Dao_00_survey;
import com.flutter.base.dao.KKG_Dao01_rsList;
import com.flutter.base.model.Dto_00_survey;
import com.flutter.base.model.KKG_Dto00_forUser;

@Service
public class Service_00_survey_Impl implements Service_00_survey {

	
	@Autowired
	Dao_00_survey dao;

	@Override
	public JSONObject getSurvey01() {
		
		JSONObject jsonList = new JSONObject();
		JSONArray itemList = new JSONArray();
		
		List<Dto_00_survey> rs = dao.getSurvey01();
		
		for(int i= 0; i<rs.size();i++) {
            JSONObject tempJson = new JSONObject();
            tempJson.put("sSeq", rs.get(i).getSseq());
            tempJson.put("question", rs.get(i).getQuestion());
            tempJson.put("sinsertdate", rs.get(i).getSinsertdate());
            tempJson.put("supdatedate", rs.get(i).getSupdatedate());
            tempJson.put("sdeletedate", rs.get(i).getSdeletedate());
            tempJson.put("sdeleted", rs.get(i).getSdeleted());
            tempJson.put("category", rs.get(i).getCategory());
            itemList.add(tempJson);
			
			
		}
		jsonList.put("results", itemList);

		

		
		
		return jsonList;
	}

	@Override
	public JSONObject getSurvey02() {
		JSONObject jsonList = new JSONObject();
		JSONArray itemList = new JSONArray();
		
		List<Dto_00_survey> rs = dao.getSurvey02();
		
		for(int i= 0; i<rs.size();i++) {
            JSONObject tempJson = new JSONObject();
            tempJson.put("sSeq", rs.get(i).getSseq());
            tempJson.put("question", rs.get(i).getQuestion());
            tempJson.put("sinsertdate", rs.get(i).getSinsertdate());
            tempJson.put("supdatedate", rs.get(i).getSupdatedate());
            tempJson.put("sdeletedate", rs.get(i).getSdeletedate());
            tempJson.put("sdeleted", rs.get(i).getSdeleted());
            tempJson.put("category", rs.get(i).getCategory());
            itemList.add(tempJson);
			
			
		}
		jsonList.put("results", itemList);
		return jsonList;
	}

	@Override
	public JSONObject getSurvey03() {
		JSONObject jsonList = new JSONObject();
		JSONArray itemList = new JSONArray();
		
		List<Dto_00_survey> rs = dao.getSurvey03();
		
		for(int i= 0; i<rs.size();i++) {
            JSONObject tempJson = new JSONObject();
            tempJson.put("sSeq", rs.get(i).getSseq());
            tempJson.put("question", rs.get(i).getQuestion());
            tempJson.put("sinsertdate", rs.get(i).getSinsertdate());
            tempJson.put("supdatedate", rs.get(i).getSupdatedate());
            tempJson.put("sdeletedate", rs.get(i).getSdeletedate());
            tempJson.put("sdeleted", rs.get(i).getSdeleted());
            tempJson.put("category", rs.get(i).getCategory());
            itemList.add(tempJson);
			
			
		}
		jsonList.put("results", itemList);
		return jsonList;
	}



	@Override
	public JSONObject save(String uid, String sSeq, String answer, String result, String category, Timestamp ts) {
		JSONObject jsonList = new JSONObject();
		JSONArray itemList = new JSONArray();
		
		List<Dto_00_survey> rs = dao.save(uid,sSeq,answer,result,category,ts);
		return null;
	}
	
	
	
}
