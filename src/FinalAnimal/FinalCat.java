package FinalAnimal;

public class FinalCat extends FinalAnimal{

	@Override
	public void cry() {
		super.cry();
		System.out.println("야옹");
	}

	public void grooming(){
		System.out.println(name + "가 그루밍한다.");
	}
}
