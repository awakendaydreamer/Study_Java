package com.tjo.dog;

public class DogDTO {
	private String name;
	private int age;
	
	public DogDTO() {
		// TODO Auto-generated constructor stub
	}

	public DogDTO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	
}
