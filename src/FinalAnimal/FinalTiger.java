package FinalAnimal;

public class FinalTiger extends FinalAnimal{

	@Override
	public void cry() {
		super.cry();
		System.out.println("어흥");
	}

	public void hunter(){
		System.out.println(name + "가 사냥을 한다.");
	}
}
