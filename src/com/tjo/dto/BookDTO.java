package com.tjo.dto;	//package 선언문

public class BookDTO {
	//①멤버변수 선언
	private String title; //제목
	private String name;	//저자
	private String comp;	//출판사
	private int cost;	//단가
	private int su;	//수량
	private int price;	//가격
	
	
	//② 디폴트생성자 : 빈깡통 → 다른 클래스에서 접근이 가능하도록 하기위해 생성
	// 디폴트 생성자의 이름은 반드시 클래스 이름과 동일해야 한다.

	//③생성자 메서드의 매개변수를 초기화 : 자동으로 생성 
	public BookDTO(String title, String name, String comp, int cost, int su) {
		super();
		this.title = title;
		this.name = name;
		this.comp = comp;
		this.cost = cost;
		this.su = su;
	}

	//④Getter and Setter 메서드 정의 : 자동으로 생성
	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getComp() {
		return comp;
	}


	public void setComp(String comp) {
		this.comp = comp;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public int getSu() {
		return su;
	}


	public void setSu(int su) {
		this.su = su;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	

	
}
