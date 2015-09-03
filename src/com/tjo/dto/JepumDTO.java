package com.tjo.dto;

public class JepumDTO {
	//제품명(name),단가(cost),수량(su),판매가격(price),판매순위(rank)
	private String name;
	private int cost;
	private int su;
	private int price;
	private int rank;
	
	//디폴트 생성자
	public JepumDTO() {
	}
	//생성자 메서드 초기화 

	public JepumDTO(String name, int cost, int su) {
		super();
		this.name = name;
		this.cost = cost;
		this.su = su;
	}
	//Getter & Setter 초기화

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
