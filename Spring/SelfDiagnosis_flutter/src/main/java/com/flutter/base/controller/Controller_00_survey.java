package com.flutter.base.controller;

import java.sql.Timestamp;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flutter.base.service.KKG_service01_rsList;
import com.flutter.base.service.Service_00_survey;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class Controller_00_survey {

	@Autowired
	Service_00_survey service;
	
	
	@RequestMapping("/survey01")
	public String survey_01(HttpServletRequest request, Model model) throws Exception{
		
		JSONObject surveyList = service.getSurvey01();
		
		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
		// Json을 UTF8로 인코딩하기 위함.
		
		model.addAttribute("results", surveyList);
		
		return "survey01";
	}
	
	@RequestMapping("/survey02")
	public String survey_02(HttpServletRequest request, Model model) throws Exception{
		JSONObject surveyList = service.getSurvey02();
		
		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
		// Json을 UTF8로 인코딩하기 위함.
		
		model.addAttribute("results", surveyList);
		
		
		
		return "survey02";
	}
	
	@RequestMapping("/survey03")
	public String survey_03(HttpServletRequest request, Model model) throws Exception{
		JSONObject surveyList = service.getSurvey03();
		
		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
		// Json을 UTF8로 인코딩하기 위함.
		
		model.addAttribute("results", surveyList);
		
		
		return "survey03";
	}
	
	
	@RequestMapping("/save") //심혈관질환 답변 넣는 함
	public String save(HttpServletRequest request, Model model) throws Exception{
		
		String uid =request.getParameter("uid");
		String sSeq =request.getParameter("sSeq");
		String answer =request.getParameter("answer");
		String result = request.getParameter("Result");
		String category = request.getParameter("category");
		Timestamp ts = new Timestamp(System.currentTimeMillis());
		
		try { 
		JSONObject surveyList = service.save(uid,sSeq,answer,result,category, ts);
		model.addAttribute("results", "success");
		} catch (Exception e) {
			System.out.println(e);
			model.addAttribute("results", "fail");
			
		}
		
		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
		// Json을 UTF8로 인코딩하기 위함.
		
		
		
		
		return "save";
	}
	@RequestMapping("/save_daibetes")
	public String save_diabetes(HttpServletRequest request, Model model) throws Exception{
////		/
//		String age =request.getParameter("uid");
//		String gender =request.getParameter("sSeq");
//		String cholesterol =request.getParameter("answer");
//		String bmi = request.getParameter("Result");
//		String cardio = request.getParameter("category");
//		String exercise = request.getParameter("category");
//		String vege = request.getParameter("category");
//		String drink = request.getParameter("category");
//		String walk = request.getParameter("category");
//		String highBP = request.getParameter("category");
//		String mental = request.getParameter("category");
//		
//		try { 
//			JSONObject surveyList = service.save(uid,sSeq,answer,result,category);
//			model.addAttribute("results", "success");
//		} catch (Exception e) {
//			System.out.println(e);
//			model.addAttribute("results", "fail");
//			
//		}
//		
//		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
//		// Json을 UTF8로 인코딩하기 위함.
		
		
		
		
		return "save_diabetes";
	}
	
	
}
