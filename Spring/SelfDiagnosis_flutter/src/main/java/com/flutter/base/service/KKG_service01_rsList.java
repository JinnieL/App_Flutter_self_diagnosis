package com.flutter.base.service;

import java.util.List;

import org.json.simple.JSONObject;

import com.flutter.base.model.KKG_Dto01_forAnswer;

public interface KKG_service01_rsList {

	JSONObject getCardioList(String uid);   //자가진단 목록 가져오기

	JSONObject getDetailList(String uid, String iDate);	//답변 상세 페이지에 넣을 질문 - 답변 가져오기

	JSONObject getWholeList(String uid);

}
