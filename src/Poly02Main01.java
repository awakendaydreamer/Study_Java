import com.tjo.poly02.Animal;
import com.tjo.poly02.Cat;
import com.tjo.poly02.Dog;


public class Poly02Main01 {

	public static void main(String[] args) {
		//Dog 객체를 UpCasting(Animal)하여 객체생성
		Animal animal = new Dog();	//UpCasting
		animal.eat();
	
		//Cat 객체를 UpCasting 하여 객체생성
		animal = new Cat();
		animal.eat();
	
	}//main()
}//class
