package com.flutter.base.service;

import java.sql.Timestamp;

import org.json.simple.JSONObject;

public interface Service_00_survey {

	JSONObject getSurvey01();

	JSONObject getSurvey02();

	JSONObject getSurvey03();

	JSONObject save(String uid, String sSeq, String answer, String result, String category, Timestamp ts);

}
