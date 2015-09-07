package OOP3;

public class Ex_Static02Main {

	public static void main(String[] args) {
		//Ex_Static02 클래스의 display() 메서드를 호출하시오.
//		Ex_Static02 st = new Ex_Static02();	//private 선언 : 객체를 생성할 수 없다. ▶  접근제한
//		st.display();
//		st.print();
		
		
		//접근제한 (private) : 클래스의 이름 + . + static 멤버메서드()
//		Ex_Static02.display();	//static 없다 ▶  접근 불가능
		Ex_Static02.print();	//static 있다 ▶  접근 가능
		
		
		//static : 접근이 편하지만 난발하지 않는다 ▶ 메모리 문제(java는 garage collector가 해결)
	}//main()

}//class
