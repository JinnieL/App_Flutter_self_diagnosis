package com.flutter.base.service;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flutter.base.dao.KKG_Dao00_login;
import com.flutter.base.model.KKG_Dto00_forUser;

@Service
public class KKG_service00_login_Impl implements KKG_service00_login {

	@Autowired
	KKG_Dao00_login dao;

	@Override
	public JSONObject login(String uid, String password) {
		JSONObject jsonList = new JSONObject();
		JSONArray itemList = new JSONArray();

				
				
		List<KKG_Dto00_forUser> results = dao.getLogin(uid, password);
//		System.out.println(uid+"service 까지는 왔니?");

		if (results != null) {
			for (int i = 0; i < results.size(); i++) {
				JSONObject tempJson =new JSONObject();
				tempJson.put("uid", results.get(i).getUid());
				tempJson.put("upassword", results.get(i).getUpassword());
				tempJson.put("uname", results.get(i).getUname());
				tempJson.put("weight", results.get(i).getWeight());
				tempJson.put("height", results.get(i).getHeight());
				tempJson.put("uemail", results.get(i).getUemail());
				tempJson.put("uphone", results.get(i).getUphone());
				tempJson.put("uinsertdate", results.get(i).getUinsertdate());
				tempJson.put("count", results.get(i).getCount());
				tempJson.put("udeleted", results.get(i).getUdeleted());

				itemList.add(tempJson);
			}
			jsonList.put("results", itemList);

		} else {
			jsonList = null;
		}

		return jsonList;

	}
}
