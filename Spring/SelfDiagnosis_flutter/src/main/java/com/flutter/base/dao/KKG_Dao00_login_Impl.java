package com.flutter.base.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.flutter.base.model.KKG_Dto00_forUser;

public class KKG_Dao00_login_Impl implements KKG_Dao00_login {
	
	
	SqlSession sqlSession;
	public String nameSpace = "com.flutter.base.dao.KKG_Dao00_login";
	
	@Override
	public List<KKG_Dto00_forUser> getLogin(String uid, String pwd){
		
			
		return sqlSession.selectList(nameSpace+".getLogin");
	}


}
