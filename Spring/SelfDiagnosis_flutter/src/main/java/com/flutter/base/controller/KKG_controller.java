package com.flutter.base.controller;

import java.nio.charset.StandardCharsets;
import java.util.List;

import org.json.simple.JSONObject;
import org.rosuda.REngine.Rserve.RConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flutter.base.model.KKG_Dto01_forAnswer;
import com.flutter.base.service.KKG_service00_login;
import com.flutter.base.service.KKG_service01_rsList;
import java.nio.charset.StandardCharsets;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class KKG_controller {

	@Autowired
	KKG_service01_rsList service_rsList;
	@Autowired
	KKG_service00_login service_login;
	
	
	
	

	@RequestMapping("/detailList")
	public String detailList(HttpServletRequest request, Model model) throws Exception {
		
		// request 에는 uid가 있어. Clear
		String uid = request.getParameter("uid");
		String iDate = request.getParameter("insertdate");
		//System.out.println(uid + "DetailList Controller 가동");
		
		// Service_rsList를 불러와서 Dao를 작동시킬거야. clear
		// Dao 에서는 DB에 cardio_insertdate (db 콜룸명 : a_insertdate) cardio_rs (DB 콜룸명 :
		// a_result) 를 불러올거야. clear
		// 조건은 : uid 가 일치하고,deleted가 0 이고, category가 1인 조건으로 answer 테이블에서 가져올거고, 중복값
		// 제거할거
		// 왜냐? 리스트만 보여주기 위해서 가져오는거거든. clear
		// 그리고 가져온걸 Service에서 "cardio"라고 맵핑된 JSON 파일로 만들거야.
		JSONObject detailList = service_rsList.getDetailList(uid, iDate);
		
		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
		// Json을 UTF8로 인코딩하기 위함.
		
		model.addAttribute("detailList", detailList);
		
		// JSON 출력할때, UTF8로 인코딩되어야하는데 이거는 JSP 파일에서 해야된다.
		// 왜냐? 어차피 JSP의 body에는 문자열로 입력되고, app에서는 그 문자열을 읽어가기 때문이다.
		
		return "detailList";
		
	}
	
	@RequestMapping("/wholeList")
	public String getWhole(HttpServletRequest request, Model model) throws Exception {

		// request 에는 uid가 있어. Clear
		String uid = request.getParameter("uid");
		//System.out.println(uid + "컨트롤러에서 처음 출력");

		// Service_rsList를 불러와서 Dao를 작동시킬거야. clear
		// Dao 에서는 DB에 cardio_insertdate (db 콜룸명 : a_insertdate) cardio_rs (DB 콜룸명 :
		// a_result) 를 불러올거야. clear
		// 조건은 : uid 가 일치하고,deleted가 0 이고, category가 1인 조건으로 answer 테이블에서 가져올거고, 중복값
		// 제거할거
		// 왜냐? 리스트만 보여주기 위해서 가져오는거거든. clear
		// 그리고 가져온걸 Service에서 "cardio"라고 맵핑된 JSON 파일로 만들거야.
		JSONObject result = service_rsList.getWholeList(uid);

		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
		// Json을 UTF8로 인코딩하기 위함.

		model.addAttribute("result", result);

		// JSON 출력할때, UTF8로 인코딩되어야하는데 이거는 JSP 파일에서 해야된다.
		// 왜냐? 어차피 JSP의 body에는 문자열로 입력되고, app에서는 그 문자열을 읽어가기 때문이다.

		return "wholeList";

	}
	
	
	@RequestMapping("/.cardioList")
	public String getCardio(HttpServletRequest request, Model model) throws Exception {

		// request 에는 uid가 있어. Clear
		String uid = request.getParameter("uid");
		//System.out.println(uid + "컨트롤러에서 처음 출력");

		// Service_rsList를 불러와서 Dao를 작동시킬거야. clear
		// Dao 에서는 DB에 cardio_insertdate (db 콜룸명 : a_insertdate) cardio_rs (DB 콜룸명 :
		// a_result) 를 불러올거야. clear
		// 조건은 : uid 가 일치하고,deleted가 0 이고, category가 1인 조건으로 answer 테이블에서 가져올거고, 중복값
		// 제거할거
		// 왜냐? 리스트만 보여주기 위해서 가져오는거거든. clear
		// 그리고 가져온걸 Service에서 "cardio"라고 맵핑된 JSON 파일로 만들거야.
		JSONObject cardioList = service_rsList.getCardioList(uid);

		// 이걸 Attribute에 넣어서 JSP 파일로 보내서 body 에 출력해줄거야???
		// Json을 UTF8로 인코딩하기 위함.

		model.addAttribute("cardioList", cardioList);

		// JSON 출력할때, UTF8로 인코딩되어야하는데 이거는 JSP 파일에서 해야된다.
		// 왜냐? 어차피 JSP의 body에는 문자열로 입력되고, app에서는 그 문자열을 읽어가기 때문이다.

		return "cardioList";

	}

	
	@RequestMapping("/.login")
	public String doLogin(HttpServletRequest request, Model model) throws Exception {

		// request에 uid랑 password가 있어.
		String uid = request.getParameter("uid");
		String psw = request.getParameter("upassword");
		System.out.println(uid);
		System.out.println(psw);
		// KKG_Serivice00_Login을 불러와서 KKG_Dao00_Login을 실행할 거야.
		JSONObject results = service_login.login(uid, psw);

		model.addAttribute("results", results);

		// KKG_Dao00_Login에서는 DB에서 아래 내용들을 가져올거야.
		// 01. user에서 uid랑 psw가 일치하는 값의 카운트 가져올거야. count
		// 02. user에서 uid 랑 password 가 일치하는 uid / upassword / uname / weight / height /
		// uemail / uphone / uinsertdate / udeleted
		// 두개 가져온내용을 하나로 묶어서 results 라고 mapping된 Json 리스트로 만들어서출력해줄거양.

		return "dologin";

	}

}
