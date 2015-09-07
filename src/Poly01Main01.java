import com.tjo.poly01.Animal;
import com.tjo.poly01.Cat;
import com.tjo.poly01.Dog;


public class Poly01Main01 {
	//Dog 객채를 생성하고 eat() 메서드를 호출하시오.
	public static void main(String[] args) {
		//상황1 : Dog 객체를 자신이 직접 만들었기 때문에
		//Dog 객체 안에 무슨 동작이 있고, 그 동작이 어떻게 구동이 되는지를 알고 있다.
		Dog dog = new Dog();	//Dog 객체생성						:부모클래스를 사용하지 않는 경우(일반적인경우)
		dog.eat();				//eat() 메서드 호출	
		
		//상황2 : Dog 객체를 다른 사람이 만들어서 나에게 주었다(Dog.class)
		//Dog 객체 안에 무슨 동작이 있고, 어떻게 구동이 되는지 알 수 없다.
			
		
		//상황3 : Dog 클래스와 Animal 클래스를 나에게 주었다.(Dog.class & Animal.class)
		//Dog.class(자식) ------> Animal class(부모) 
		Animal animal = new Dog();	//객체에대한 업캐스팅(UpCasting) : 부모클래스를 사용하는 경우
		animal.eat();				//
		
		animal = new Cat();
		animal.eat();
//		animal.night(); 			//동작되지 않는다.(Animal Class에는 night() 메서드가 없으므로)
		
		Cat cat = new Cat();
		cat.night();
	}//main()
}//class

/*
 * ○ 다형성 : 상위클래스가 동일한 메세지로 하위 클래스를 서로 다르게 동작시키는 객체지향 개념 ▶ 상속이 전제조건
 * ○ 예1) 부모가 자식에게 꽃을 사와라 (동일한 지시/명령)
 *    	-큰아들 : 인터넷 주문을 통해 꽃 배달을 이용하여 꽃을 사온다.
 *		-딸 : 남자친구에게 부탁하여 꽃을 사온다.
 *		-막내아들 : 꽃을 꺾어서 꽃을 가져온다.
 *
 * ○ 다형성의 전제조건 
 * 		-상속관계
 * 		-재정의(override)가 필수 : 자식클래스에서 재정의
 * 		-부모쪽으로 객체를 생성한다. : UpCasting
 * 
 * ○ 다형성의 특징
 * 		- 하위 클래스의 동작방식을 몰라도 하위클래스를 동작시킬 수 있다.
 * 		- 하위클래스의 동작이 수정되더라도 사용하는(main)쪽에서는 영향을 미치지 않는다.
 * 		- 확장성이 좋아진다.
 * 		- 상위클래스로 하위클래스를 총제할 수 있다.
 * 		- 동적바인딩(실행시점에서 사용될 메서드가 결정)으로 인한 속도저하
 * 
 */


