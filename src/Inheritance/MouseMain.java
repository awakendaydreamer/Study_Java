package Inheritance;

public class MouseMain {

	public static void main(String[] args) {
		System.out.println("Mouse Class");
		Mouse m = new Mouse();	//Mouse 객체 생성
		
		m.clickLeft();
		m.clickRight();
		System.out.println("=====================");
		
		System.out.println("WheelMouse Class");
		WheelMouse wm = new WheelMouse();	//WheelMouse 객체 생성
		wm.clickLeft();	//상속받은 상위클래스(Mouse)의 메서드
		wm.clickRight();//상속받은 상위클래스(Mouse)의 메서드
		wm.scroll();	//하위 클래스 (WheelMouse)의 메서드
		System.out.println("======================");
		
		System.out.println("OpticalMouse Class");
		OpticalMouse om = new OpticalMouse();
		om.clickLeft();
		om.clickRight();
		om.scroll();
		System.out.println("=======================");
		
	}//main()

}//class
