package com.tjo.dto;

public class JepumDTO {
	//��ǰ��(name),�ܰ�(cost),����(su),�ǸŰ���(price),�Ǹż���(rank)
	private String name;
	private int cost;
	private int su;
	private int price;
	private int rank;
	
	//����Ʈ ������
	public JepumDTO() {
	}
	//������ �޼��� �ʱ�ȭ 

	public JepumDTO(String name, int cost, int su) {
		super();
		this.name = name;
		this.cost = cost;
		this.su = su;
	}
	//Getter & Setter �ʱ�ȭ

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
