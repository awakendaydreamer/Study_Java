import com.tjo.poly01.Animal;
import com.tjo.poly01.Cat;
import com.tjo.poly01.Dog;


public class Poly01Main02 {

	public static void main(String[] args) {
		
		//일반적인 객체생성
		Dog dog = new Dog();		//일반적인 객체 생성하는 방법
		dog.eat();
		
		//UpCasting
		Animal ani = new Cat();		//Cat 객체는 UpCasting으로 생성
		ani.eat();
//		ani.night();				//오류가 된다 : Animal 객체는 night()메서드가 존재하지 않는다.
		
		//DownCasting
		Cat cat = (Cat)ani;			//DownCasting
		cat.night();
		((Cat)ani).night();
		
	}//main()
}//class

/*
	○ 객체를 생성하는 방법
		1.Dog dog = new Dog(); ▶ 부모클래스를 사용하지 않는 경우
		2.Animal ani = new Dog(); ▶ 부모클래스를 사용하는 경우 → 객체캐스팅이루어짐 : UpCasting
		
	 ★ 다형성의 전제조건
	 	1.상속관계 : public class 자식클래스 (B) extends 부모클래스(A) ▶  B  →  A 하위클래스 B는 상위클래스 A를 상속받았다.
	 	2.객체를 생성할 때 UpCasting : A a = new B();  
	 	3.Override(재정의) 필수 : 부모의 기능을 상속받고, 상속받은 기능의 일부를 수정하거나 
	 							기존(상속받은) 기능에 추가적인 기능을 새로 넣는 것
	 	4.동적바인딩 : 속도가 저하되는 원인						
		
*/