package OOP3;

public class Ex_Static02 {

	private Ex_Static02(){
	}//디폴트 생성자 : 다른 클래스에서 접근이 가능하도록 생성
		//Ex_Static02 디폴트 생성자가 private선언 ▶  정보은닉 : 객체를 생성할수 없다.
	public void display(){
		System.out.println("Display");
	}
	
	public static void print(){
		System.out.println("");
	}
}
