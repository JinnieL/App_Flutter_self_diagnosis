package com.flutter.base.model;

public class User {

	
	int count;
	String uid;
	String upassword;
	String uname;
	String uemail;
	String uphone;
	int height;
	int weight;
	String uinsertdate;
	String uupdatedate;
	String udeletedate;
	int udeleted;
	int ucardio;
	int udementia;
	int udiabetes;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	
	

	public User(String uid) {
		super();
		this.uid = uid;
	}




	public User(String uid, String upassword, String uname, String uemail, String uphone, int height, int weight) {
		super();
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.uemail = uemail;
		this.uphone = uphone;
		this.height = height;
		this.weight = weight;
	}




	public User(String uid, String upassword, String uname, String uemail, String uphone, int height, int weight,
			String uinsertdate, int udeleted) {
		super();
		this.uid = uid;
		this.upassword = upassword;
		this.uname = uname;
		this.uemail = uemail;
		this.uphone = uphone;
		this.height = height;
		this.weight = weight;
		this.uinsertdate = uinsertdate;
		this.udeleted = udeleted;
	}




	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUpassword() {
		return upassword;
	}

	public void setUpassword(String upassword) {
		this.upassword = upassword;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUphone() {
		return uphone;
	}

	public void setUphone(String uphone) {
		this.uphone = uphone;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getUinsertdate() {
		return uinsertdate;
	}

	public void setUinsertdate(String uinsertdate) {
		this.uinsertdate = uinsertdate;
	}

	public String getUupdatedate() {
		return uupdatedate;
	}

	public void setUupdatedate(String uupdatedate) {
		this.uupdatedate = uupdatedate;
	}

	public String getUdeletedate() {
		return udeletedate;
	}

	public void setUdeletedate(String udeletedate) {
		this.udeletedate = udeletedate;
	}

	public int getUdeleted() {
		return udeleted;
	}

	public void setUdeleted(int udeleted) {
		this.udeleted = udeleted;
	}

	public int getUcardio() {
		return ucardio;
	}

	public void setUcardio(int ucardio) {
		this.ucardio = ucardio;
	}

	public int getUdementia() {
		return udementia;
	}

	public void setUdementia(int udementia) {
		this.udementia = udementia;
	}

	public int getUdiabetes() {
		return udiabetes;
	}

	public void setUdiabetes(int udiabetes) {
		this.udiabetes = udiabetes;
	}
	
	
	
	
	
}
