package com.flutter.base.model;

public class KKG_Dto01_forAnswer {
	int seq;
	String a_uid;
	int a_sSeq;
	int a_category;
	String a_answer;
	String a_insertdate;
	int a_deleted;
	int a_result;
	String s_question;
	int s_sSeq;
	
	
	// ---------------- constructor   ---------------------------
	
	
	
	public KKG_Dto01_forAnswer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	// ------  결과 목록 보여주기 위한 Dto ---------
	public KKG_Dto01_forAnswer(String a_insertdate, int a_result) {
		super();
		this.a_insertdate = a_insertdate;
		this.a_result = a_result;
	}

	
	public KKG_Dto01_forAnswer(int s_sSeq, String s_question, String a_answer, String a_insertdate) {
		super();
		this.s_sSeq = s_sSeq;
		this.s_question = s_question;
		this.a_answer = a_answer;
		this.a_insertdate = a_insertdate;
	}
	
	
	public KKG_Dto01_forAnswer(String a_insertdate, int a_category, int a_result) {
		super();
		this.a_insertdate = a_insertdate;
		this.a_category = a_category;
		this.a_result = a_result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	//Getter & Setter
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getA_uid() {
		return a_uid;
	}
	public void setA_uid(String a_uid) {
		this.a_uid = a_uid;
	}
	public int getA_sSeq() {
		return a_sSeq;
	}
	public void setA_sSeq(int a_sSeq) {
		this.a_sSeq = a_sSeq;
	}
	public int getA_category() {
		return a_category;
	}
	public void setA_category(int a_category) {
		this.a_category = a_category;
	}
	public String getA_answer() {
		return a_answer;
	}
	public void setA_answer(String a_answer) {
		this.a_answer = a_answer;
	}
	public String getA_insertdate() {
		return a_insertdate;
	}
	public void setA_insertdate(String a_insertdate) {
		this.a_insertdate = a_insertdate;
	}
	public int getA_deleted() {
		return a_deleted;
	}
	public void setA_deleted(int a_deleted) {
		this.a_deleted = a_deleted;
	}
	public int getA_result() {
		return a_result;
	}
	public void setA_result(int a_result) {
		this.a_result = a_result;
	}


	public String getS_question() {
		return s_question;
	}


	public void setS_question(String s_question) {
		this.s_question = s_question;
	}


	public int getS_sSeq() {
		return s_sSeq;
	}


	public void setS_sSeq(int s_sSeq) {
		this.s_sSeq = s_sSeq;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
