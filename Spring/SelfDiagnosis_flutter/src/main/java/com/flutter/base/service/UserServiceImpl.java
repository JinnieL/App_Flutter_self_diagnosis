package com.flutter.base.service;


import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flutter.base.dao.UserDao;
import com.flutter.base.model.User;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao userDao;

	@Override
	public int userInfoUpdate(String uid, String password, String uname, String uemail, String uphone, int height,
			int weight) throws Exception {
		// TODO Auto-generated method stub
		return userDao.userInfoUpdate(uid, password, uname, uemail, uphone, height, weight);
		
	}

	@Override
	public JSONObject contentviewDao(String uid) throws Exception {
		
		JSONObject jsonList =null;
		JSONArray itemList = null;	
		
		List<User> lists = userDao.contentviewDao(uid);

		for (int i = 0; i < lists.size(); i++) {
			JSONObject tempJson = new JSONObject();
			tempJson.put("uid", lists.get(i).getUid());
			tempJson.put("upassword", lists.get(i).getUpassword());
			tempJson.put("uname", lists.get(i).getUname());
			tempJson.put("uemail", lists.get(i).getUemail());
			tempJson.put("uphone", lists.get(i).getUphone());
			tempJson.put("height", lists.get(i).getHeight());
			tempJson.put("weight", lists.get(i).getWeight());
			tempJson.put("uinsertdate", lists.get(i).getUinsertdate());
			tempJson.put("udeleted", lists.get(i).getUdeleted());
			itemList.add(tempJson);
		}
		
		jsonList.put("results", itemList);
		return jsonList;
	}


	
}
