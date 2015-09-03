package com.tjo.dto;

public class SungjukDTO {
	private String name;
	private int hakbun;
	private String major;
	private float java;
	private float cpp;
	private float sum;
	private float avg;
	private int rank;
	
	public SungjukDTO() {
	}
	
	public SungjukDTO(String name, int hakbun, String major, float java,
			float cpp) {
		super();
		this.name = name;
		this.hakbun = hakbun;
		this.major = major;
		this.java = java;
		this.cpp = cpp;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getHakbun() {
		return hakbun;
	}



	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}



	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	public float getJava() {
		return java;
	}



	public void setJava(float java) {
		this.java = java;
	}



	public float getCpp() {
		return cpp;
	}



	public void setCpp(float cpp) {
		this.cpp = cpp;
	}



	public float getSum() {
		return sum;
	}



	public void setSum(float sum) {
		this.sum = sum;
	}



	public float getAvg() {
		return avg;
	}



	public void setAvg(float avg) {
		this.avg = avg;
	}



	public int getRank() {
		return rank;
	}



	public void setRank(int rank) {
		this.rank = rank;
	}

	
	
	
	
	
	
	
	
}
