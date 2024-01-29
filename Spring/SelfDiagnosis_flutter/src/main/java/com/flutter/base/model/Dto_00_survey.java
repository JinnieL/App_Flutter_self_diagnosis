package com.flutter.base.model;

public class Dto_00_survey {
	int sseq;
	String question;
	String sinsertdate;
	String supdatedate;
	String sdeletedate;
	int sdeleted;
	int category;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Dto_00_survey() {
		super();
		// TODO Auto-generated constructor stub
	}





	public Dto_00_survey(int sseq, String question, String sinsertdate, String supdatedate, String sdeletedate,
			int sdeleted, int category) {
		super();
		this.sseq = sseq;
		this.question = question;
		this.sinsertdate = sinsertdate;
		this.supdatedate = supdatedate;
		this.sdeletedate = sdeletedate;
		this.sdeleted = sdeleted;
		this.category = category;
	}
	
	
	
	
	
	public int getSseq() {
		return sseq;
	}
	public void setSseq(int sseq) {
		this.sseq = sseq;
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
	public String getSupdatedate() {
		return supdatedate;
	}
	public void setSupdatedate(String supdatedate) {
		this.supdatedate = supdatedate;
	}
	public String getSdeletedate() {
		return sdeletedate;
	}
	public void setSdeletedate(String sdeletedate) {
		this.sdeletedate = sdeletedate;
	}
	public int getSdeleted() {
		return sdeleted;
	}
	public void setSdeleted(int sdeleted) {
		this.sdeleted = sdeleted;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
