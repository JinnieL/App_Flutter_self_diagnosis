package com.flutter.base.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.flutter.base.model.User;

public class UserDaoImpl implements UserDao {

	
	SqlSession sqlSession;
	public static String nameSpace = "com.flutter.base.dao.UserDao";
	
	
	
	@Override
	public int userInfoUpdate(String uid, String password, String uname, String uemail, String uphone, int height,
			int weight) throws Exception {

		
		return sqlSession.update(nameSpace + ".userInfoUpdate");
		
	}



	@Override
	public List<User> contentviewDao(String uid) throws Exception {
		List<User> rs= sqlSession.selectList(nameSpace + ".contentviewDao");
		return rs;
	}
	
}
