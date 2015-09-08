package com.tjo.poly02;

public class Dog extends Animal {	//추상클래스를 상속받는다 ▶ 구체화 (Override : 재정의)

	@Override
	public void eat() {
		System.out.println("개처럼 먹는다."); 	//구체화
	}	
	
	

}
