package com.flutter.base.controller;

import org.rosuda.REngine.Rserve.RConnection;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;


@Controller
public class KKG_controller_rds {
	
	
	
	
	@RequestMapping("/predictCardio")
	public String predictcardio(HttpServletRequest request, Model model) throws Exception{
	
		
		
		
		
		return "response_cardio";
	}
	@RequestMapping("/predictDiabetes")
	public String predictdiabetes(HttpServletRequest request, Model model) throws Exception{
		
		
		
		
		
		return "response_diabetes";
	}
	@RequestMapping("/predictdimentia")
	public String predictdimentia(HttpServletRequest request, Model model) throws Exception{
		
		
		
		
		
		return "response_dimentia";
	}
	
	
	
	
	
	
	
	
	

	
	@RequestMapping("/predictIris")
	public String predictIris(HttpServletRequest request, Model model) throws Exception{
		
		request.setCharacterEncoding("utf-8");

		double sepalLength = 5.1;
		double sepalWidth = 3.5;
		
		double petalLength =1.6; 
		double petalWidth = 0.4;
		
//		double sepalLength = Double.parseDouble(request.getParameter("sepalLength"));
//		double sepalWidth = Double.parseDouble(request.getParameter("sepalWidth"));
//		double petalLength = Double.parseDouble(request.getParameter("petalLength"));
//		double petalWidth = Double.parseDouble(request.getParameter("petalWidth"));
		
		RConnection conn = new RConnection();
		
	    Resource resource = new ClassPathResource("models/randomForest_Iris.rds");
	    
	   // String rdsAbsolutePath = resource.getFile().getAbsolutePath();
	  //  System.out.println("rds 파일 위치 : "+rdsAbsolutePath);

	    conn.voidEval("library(randomForest)");
	    conn.voidEval("rf <- readRDS('" + "models/randomForest_Iris.rds" + "')");
	    
		conn.voidEval("result <- as.character(predict(rf, (list(Sepal.Length=" + sepalLength + ", Sepal.Width=" + sepalWidth + ","
				+ "Petal.Length=" + petalLength + ", Petal.Width=" + petalWidth + "))))");

				String result = "해당 품종은 : "+conn.eval("result").asString();
		
		
		
		model.addAttribute("result",result);
		
		
		
		
		return "showIris";
	}

}
