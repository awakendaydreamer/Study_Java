import FinalAnimal.FinalAction;
import FinalAnimal.FinalCat;
import FinalAnimal.FinalDog;
import FinalAnimal.FinalLion;
import FinalAnimal.FinalTiger;


public class FinalAnimalMain {

	public static void main(String[] args) {
		FinalDog dog = new FinalDog();
		FinalCat cat = new FinalCat();
		FinalTiger tiger = new FinalTiger();
		FinalLion lion = new FinalLion();
		FinalAction action = new FinalAction();
		
		
		dog.name = "강아지";
		cat.name = "야옹이";
		tiger.name = "호랑이";
		lion.name = "레오";
				
		action.action(dog);
		System.out.println("===========================");
		action.action(cat);
		System.out.println("===========================");
		action.action(tiger);
		System.out.println("===========================");
		action.action(lion);
		System.out.println("===========================");
	}

}
