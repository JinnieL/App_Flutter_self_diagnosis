package com.flutter.base.dao;

import java.util.List;

import com.flutter.base.model.KKG_Dto00_forUser;

public interface KKG_Dao00_login {

	List<KKG_Dto00_forUser> getLogin(String uid, String pwd);

}
