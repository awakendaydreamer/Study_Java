package Inheritance;

public class Dog extends Animal{	//Animal(상위클래스)로 부터 상속(상태정보)
	public Dog() {
	
	}//디폴트 생성자 : 아무런 역할을 수행하지 않는 생성자
	
	public Dog(String name, int age){
		super(name,age);
	}//super는 부모클래스를 의미한다. overload: 매개변수가 다른 생성자를 만드는것.
	
}
