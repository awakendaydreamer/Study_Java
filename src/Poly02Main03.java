import com.tjo.poly02.Animal;
import com.tjo.poly02.Cat;
import com.tjo.poly02.Dog;


public class Poly02Main03 {

	public static void main(String[] args) {
		//Dog 객체와 Cat 객체를 생성 : 일반적인 생성(new)
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		//생성된 객체의 배열에 저장하시오.
		//객체타입[] 배열명 = {~~, ~~};
		//type 을 지정할때 부모를 넣어버림
		
		Animal[] animal = {dog, cat};	//다형성배열
		
		
		for (int i = 0; i < animal.length; i++) {
			animal[i].eat();
			if (animal[i] instanceof Cat) {
				((Cat)animal[i]).night();
			}
		}	
		
	}//main()
}//class
