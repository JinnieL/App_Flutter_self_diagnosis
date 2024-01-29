package com.flutter.base.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Jin_mapController {
	
	@RequestMapping("/kakaoMapView")
	public String viewMap() throws Exception {
		System.out.println("카카오 맵 출력 컨트롤러");
		return "hospitalMap";
	}

}
