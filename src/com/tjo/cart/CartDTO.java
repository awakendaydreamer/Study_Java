package com.tjo.cart;

public class CartDTO {

	private int code;
	private String name;
	private String company;
	private int cost;
	private int su;
	
	public CartDTO() {
	}

	public CartDTO(int code, String name, String company, int cost) {
		super();
		this.code = code;
		this.name = name;
		this.company = company;
		this.cost = cost;
		
	}
	
//overloading
	public CartDTO(int code, int su) {
		super();
		this.code = code;
		this.su = su;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
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
		return cost*su;
	}
	
}
