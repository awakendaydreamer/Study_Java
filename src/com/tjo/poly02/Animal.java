package com.tjo.poly02;

public abstract class Animal {	//abstract class : 추상클래스 
	public abstract void eat();	//abstract ~~() ▶  추상메서드 

}



/*
	★ 추상클래스 : 다형성을 보장하기 위해서 등장 ▶ abstract Class
		1. 추상메서드가 한개라도 있으면 추상클래스가 된다 ▶ abstract Class
		2. 객체를 생성할 수 없다 : Animal animal = new Animal(); ▶  생성할 수 없다.
		3. 부모의 역할을 수행하기 위해서는 UpCasting
		4. 기능이 서로 비슷한 클래스의 공통적인 부분을 묶을때 사용
	
*/