package com.tjo.book;

public class BookDTO {
	//멤버변수 선언 : 정보은닉 → private
	private int num;
	private String title;
	private String company;
	private String name;
	private int price;
	//디폴트 생성자 메서드
	public BookDTO() {
	}
	//
	public BookDTO(int num, String title, String company, String name, int price) {
		super();
		this.num = num;
		this.title = title;
		this.company = company;
		this.name = name;
		this.price = price;
	}
	
	//
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTltle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
