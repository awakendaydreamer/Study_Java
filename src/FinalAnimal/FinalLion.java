package FinalAnimal;

public class FinalLion extends FinalAnimal {

	@Override
	public void cry() {
		super.cry();
		System.out.println("어흐응~!");
	}

	public void jump(){
		System.out.println(name + "가 점프를 한다.");
	}

	
}
