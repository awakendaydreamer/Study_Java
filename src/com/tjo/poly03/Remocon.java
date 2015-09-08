package com.tjo.poly03;

public interface Remocon { //Interface Class
	public abstract void volUp();	//abstract → 추상
	public abstract void volDown();	//추상메서드
	public abstract void internet();
	
	
}

/*

	○ Interface Class : JAVA는 단일 상속만 허용, 다중상속의 이점을 활용할 필요
		- 서로 다른 클래스의 공통 부분을 묶을 때 사용
		  (비슷한 부분을 묶을 때 : 추상클래스(abstract)사용하지만)
		- 다형성을 보장한다 : Override(재정의)
		- 메서드는 추상 메서드로 구현한다 : public abstract void ~~();
		- Interface Class의 상속은 implements 사용해 받음
		  (abstract Class의 상속은 extends 사용해 받음)
		  
		예)public class A { ~~~ body ~~~ } ▶  일반적인 클래스의 생성방식
		
	
		  public class A extends B { ~~~ body ~~~ } ▶ A(자식) → B(부모)
		  	▶ A는 B를 상속받는다.
		  	
		  public class A extends B implements C { ~~~ body ~~~ }		▶ 인터페이스의 기능을 구현한다.
		  	▶A(자식)는 B(부모)를 상속받고, C(큰아버지,Interface)에 기능을 구현하였다.
		  	
	  	  public class A extends B implements C,D {	~~~ body ~~~} 		▶ 다중상속을 위해 만든것을 인터페이스이다.
	  	   	▶A는 B를 상속받고 , C와 D의 기능을 구현하였다.
*/