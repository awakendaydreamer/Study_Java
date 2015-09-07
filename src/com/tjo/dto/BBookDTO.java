package com.tjo.dto;

public class BBookDTO {

	private String title;
	private int price;
	private String name;
	private String company;
	
	public BBookDTO() {
	}

	public BBookDTO(String title, int price, String name, String company) {
		super();
		this.title = title;
		this.price = price;
		this.name = name;
		this.company = company;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
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
	
	
	
	
}
