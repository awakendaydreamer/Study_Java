import com.tjo.poly02.Animal;
import com.tjo.poly02.Cat;
import com.tjo.poly02.Dog;


public class Poly02Main02 {

	public static void main(String[] args) {

		Dog dog = new Dog();	//Dog 객체 생성
		Cat cat = new Cat();	//Cat 객체 생성
	
		display(dog);
		display(cat);
	
	}//main()

	public static void display(Animal animal){ //가인수(Argument) → 다형성 인수
		animal.eat();
		//Cat.night(); //오류 : 동작되지 않는다.
		//((Cat)animal).night();//DownCasting ▶ 예외(Exception)가 발생함 why? 가지고있는지 알수가 없어서 
		//Cat 타입으로 넘어온 경우에만 night() 메서드 동작
		if (animal instanceof Cat) {	//instanceof : 타입을 정확하게 알아본다(true, false)
			((Cat)animal).night();		//animal의 하위클래스가 Cat이냐? 한번확인하는것
		}
		
	}//display()
}
