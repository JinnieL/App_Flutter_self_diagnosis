package com.flutter.base.service;

import java.nio.charset.StandardCharsets;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flutter.base.dao.KKG_Dao01_rsList;
import com.flutter.base.model.KKG_Dto01_forAnswer;
import com.flutter.base.model.KKG_Dto02_forSurvey;

@Service
public class KKG_service01_rsList_Impl implements KKG_service01_rsList {

	@Autowired
	KKG_Dao01_rsList dao;
	
	
	
	@Override
	public JSONObject getWholeList(String uid) {	
		JSONObject jsonList = new JSONObject();
		JSONArray itemList = new JSONArray();
		List<KKG_Dto01_forAnswer> wholeThings = dao.getWholeList(uid);
		for (int i = 0; i < wholeThings.size(); i++) {
			JSONObject tempJson = new JSONObject();
			tempJson.put("insertdate", wholeThings.get(i).getA_insertdate());
			tempJson.put("category", wholeThings.get(i).getA_category());
			tempJson.put("result", wholeThings.get(i).getA_result());
			itemList.add(tempJson);
		}
		jsonList.put("result", itemList);
		return jsonList;
		
		
	}

	@Override
	public JSONObject getCardioList(String uid) {

		JSONObject jsonList = new JSONObject();
		
		List<KKG_Dto01_forAnswer> cardio = dao.getCardioList(uid);
		List<KKG_Dto01_forAnswer> diabetes = dao.getDiabetesList(uid);
		List<KKG_Dto01_forAnswer> getdiamentia = dao.getDiamentiaList(uid);
		System.out.println(cardio);
		System.out.println(diabetes);
		System.out.println(getdiamentia);
		
		// -------------- Cardio 치료하기
		
		//jsonList = null;
		
		if (cardio != null) {
			JSONArray itemList = new JSONArray();
			for (int i = 0; i < cardio.size(); i++) {
				JSONObject tempJson = new JSONObject();
				
				tempJson.put("cardio_insertdate", cardio.get(i).getA_insertdate());
				tempJson.put("cardio_rs", cardio.get(i).getA_result());
				itemList.add(tempJson);
			}
			jsonList.put("cardio", itemList);
			

		} else {
			
		}
		
		// --------------- diabetes 치료하기 
		if (diabetes != null) {
			JSONArray itemList = new JSONArray();
			for (int i = 0; i < diabetes.size(); i++) {
				JSONObject tempJson = new JSONObject();
				
				
				tempJson.put("diabetes_insertdate", diabetes.get(i).getA_insertdate());
				tempJson.put("diabetes_rs", diabetes.get(i).getA_result());
				itemList.add(tempJson);
			}
			jsonList.put("diabetes", itemList);
			
			
		} else {

		}
		
		// --------------- diamentia 치료하기 
		if (getdiamentia != null) {
			JSONArray itemList = new JSONArray();
			for (int i = 0; i < getdiamentia.size(); i++) {
				JSONObject tempJson = new JSONObject();
				tempJson.put("diamentia_insertdate", getdiamentia.get(i).getA_insertdate());
				tempJson.put("diamentia_rs", getdiamentia.get(i).getA_result());
				itemList.add(tempJson);
			}
			jsonList.put("diamentia", itemList);
			
			
		} else {

		}
	
		
		
		System.out.println(jsonList);
		return jsonList;

	}
	
	
	//답변 상세 페이지에 넣을 질문 - 답변들가져오기 위한 함

	@Override
	public JSONObject getDetailList(String uid, String iDate) {
		
		//System.out.println("Service Impl 실행 하는 중" );
		
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parsedDate = null; 
        try {
			parsedDate =  dateFormat.parse(iDate);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Timestamp timestamp = new Timestamp(parsedDate.getTime());
        //System.out.println(timestamp);
		

		
		
		JSONObject detailList =new JSONObject();
		JSONArray itemList = new JSONArray();
		
		List<KKG_Dto02_forSurvey> detail = dao.getDetailList(uid, timestamp);
		
		for( int i =0; i<detail.size(); i++) {
		JSONObject tempJson = new JSONObject();
		tempJson.put("seq", detail.get(i).getsSeq());
		tempJson.put("question", detail.get(i).getQuestion());
		tempJson.put("answer", detail.get(i).getA_answer());
		tempJson.put("insertdate", detail.get(i).getA_insertdate());
		itemList.add(tempJson);
		}
		detailList.put("detailList",itemList);
		
		
		
		
		return detailList;
	}

}
