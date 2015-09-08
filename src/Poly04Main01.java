import com.tjo.poly04.A;
import com.tjo.poly04.B;


public class Poly04Main01 {

	public static void main(String[] args) {
		A a = new A();	//일반적인 객체 생성
		a.display();
		
		B b = new B();
		b.display();
		
		//[조건] A 클래스 객체를 UpCasting으로 생성하고 display()메서드 호출
		Object obj1 = new A();	//UpCasting으로 객체 생성
		((A)obj1).display();	//DownCasting으로 메서드 호출
		
		Object obj2 = new B();
		((B)obj2).display();
		

	}

}
