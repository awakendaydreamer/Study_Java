package com.tjo.poly01;

public class Cat extends Animal {	//상속
	public void night(){
		System.out.println("고양이는 야행성이다.");
	}

	@Override
	public void eat() {	//override : 재정의
		System.out.println("고양이처럼 먹는다.");
	}
	
	
}
