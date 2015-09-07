package Inheritance;

public class OpticalMouse extends WheelMouse {
	//상위클래스인 WheelMouse Class를 하위클래스인 OpticalMouse Class가 상속(Inheritance)
	//오버라이드(Override) : 자식클래스에서 부모클래스의 메서드르 다시 정의(재정의)
	
	@Override
	public void clickLeft(){
		System.out.println("광마우스 Left 클릭");	//상속받은 clickLeft() 메서드를 재정의
	}

	@Override
	public void clickRight() {
		System.out.println("광마우스 Right 클릭");
	}

	@Override
	public void scroll() {
		System.out.println("광마우스 scroll 기능");
	}

	
	
}
