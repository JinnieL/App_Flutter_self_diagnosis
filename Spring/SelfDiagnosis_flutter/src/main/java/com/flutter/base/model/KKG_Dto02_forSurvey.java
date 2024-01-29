package com.flutter.base.model;

public class KKG_Dto02_forSurvey {
	
	
	int sSeq;
	String question;
	String sinsertdate;
	String a_answer;
	String a_insertdate;
	public KKG_Dto02_forSurvey() {
		super();
		// TODO Auto-generated constructor stub
	}
	public KKG_Dto02_forSurvey(int sSeq, String question, String a_answer, String a_insertdate) {
		super();
		this.sSeq = sSeq;
		this.question = question;
		this.a_answer = a_answer;
		this.a_insertdate = a_insertdate;
	}
	public int getsSeq() {
		return sSeq;
	}
	public void setsSeq(int sSeq) {
		this.sSeq = sSeq;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public String getSinsertdate() {
		return sinsertdate;
	}
	public void setSinsertdate(String sinsertdate) {
		this.sinsertdate = sinsertdate;
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
	
	
	
	
	
	
	

}
