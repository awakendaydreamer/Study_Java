import java.util.Arrays;

import com.tjo.poly02.Animal;
import com.tjo.poly02.Cat;
import com.tjo.poly02.Dog;


public class Poly02Main04 {

	public static void main(String[] args) {
		//Dog 객체와 Cat 객체를 배열에 저장하시오 → 다형성 배열
		Animal[] animal = new Animal[2];
		animal[0] = new Dog();
		animal[1] = new Cat();
		display(animal);
	}//main()

	//display()메서드를 정의하고 eat()메서드를 동작
	public static void display(Animal[] animal){
		for (int i = 0; i < animal.length; i++) {
			animal[i].eat();
		}
	}
	
}
