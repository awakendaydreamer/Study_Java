package FinalAnimal;

public class FinalAction {

	public void action(FinalAnimal animal){
		animal.cry();
		
		if (animal instanceof FinalDog) {
			((FinalDog)animal).run();
		}else if(animal instanceof FinalCat){
			((FinalCat)animal).grooming();
		}else if(animal instanceof FinalTiger){
			((FinalTiger)animal).hunter();
		}else if(animal instanceof FinalLion){
			((FinalLion)animal).jump();
		}
		
	}
}
