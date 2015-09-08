package FinalAnimal;

public class FinalDog extends FinalAnimal{

	@Override
	public void cry() {
		super.cry();
		System.out.println("멍멍");
	}
	
	public void run(){
		System.out.println(name + "가 뛴다.");
	}
	
	
}
