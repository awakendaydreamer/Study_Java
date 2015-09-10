package com.tjo.member;

public class MemberDTO {
	private String name;
	private int age;
	private String address;
	private String telephon;
	
	public MemberDTO() {
	}

	public MemberDTO(String name, int age, String address, String telephon) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
		this.telephon = telephon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephon() {
		return telephon;
	}

	public void setTelephon(String telephon) {
		this.telephon = telephon;
	}

		
}
