package com.flutter.base.service;

import java.util.List;

import org.json.simple.JSONObject;

import com.flutter.base.model.User;

public interface UserService {
	
	public int userInfoUpdate(String uid, String password, String uname, String uemail, String uphone, int height,
			int weight) throws Exception;

	
	public JSONObject contentviewDao(String uid) throws Exception;
	
}
