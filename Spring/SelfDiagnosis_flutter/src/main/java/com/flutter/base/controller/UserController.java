package com.flutter.base.controller;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flutter.base.model.User;
import com.flutter.base.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class UserController {

	
	@Autowired
	UserService userService;
	
//	@RequestMapping("/updateUserInfo")
//	public String updateUserInfo(HttpServletRequest request, Model model) throws Exception{
//		
//		String uid = request.getParameter("uid");
//		String upassword = request.getParameter("upassword");
//		String uname = request.getParameter("uname");
//		String uemail = request.getParameter("uemail");
//		String uphone = request.getParameter("uphone");
//		int height = Integer.parseInt(request.getParameter("height"));
//		int weight = Integer.parseInt(request.getParameter("weight"));
//		
//		int updateUserList = userService.userInfoUpdate(uid, upassword, uname, uemail, uphone, height, weight);
//		JSONObject result = null;
//		result.put("result",updateUserList);
//		System.out.println("@@@@");
//		System.out.println("result");
//		model.addAttribute("result",result);
//		
//		return "updateUser";
//		
//	}
//	
//	
//	@RequestMapping("/yourProfile")
//	public String contentView(HttpServletRequest request, Model model) throws Exception{
//		JSONObject lists = userService.contentviewDao(request.getParameter("uid"));
//		model.addAttribute("results",lists);
//
//		return "result";
//	}
//	
	
	
	
	
	// 유저 개인 정보 보여주
	@RequestMapping("/userDetails")
	public String detail(HttpServletRequest request, Model model) throws Exception{
		return "user/select_userinfo";
	}
	
	// 유저 정보 변경
	@RequestMapping("/updateInfo")
	public String updateInfo(HttpServletRequest request, Model model) throws Exception{
		return "user/update_userinfo";
	}
	
	// 유저 회원탈퇴
	@RequestMapping("/deleteUser")
	public String deleteUser(HttpServletRequest request, Model model) throws Exception{
		return "user/delete_user";
	}
	
	
	// 유저회원등록
	@RequestMapping("/insertUser")
	public String insertUser(HttpServletRequest request, Model model) throws Exception{
		return "user/insert_schedule_user_register";
	}
	
	// 아이디 중복체
	@RequestMapping("/dupCheck")
	public String dupCheck(HttpServletRequest request, Model model) throws Exception{
		return "user/select_schdule_dupcheck_flutter";
	}
	
	
	// 카카오 로그인
	@RequestMapping("/kakaoLogin")
	public String kakaoLogin(HttpServletRequest request, Model model) throws Exception{
		return "user/kakao_login";
	}
	
	
}
