package com.flutter.base.dao;

import java.util.List;

import com.flutter.base.model.User;

public interface UserDao {

	
	public int userInfoUpdate(String uid, String password, String uname, String uemail, String uphone, int height,
			int weight) throws Exception;
	
	
	
	public List<User> contentviewDao(String uid) throws Exception;
}
