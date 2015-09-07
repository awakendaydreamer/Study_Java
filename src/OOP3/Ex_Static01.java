package OOP3;

public class Ex_Static01 {

	public static void main(String[] args) {

		print1(); //메서드 호출
		Ex_Static01 st = new Ex_Static01();	//객체생성
		st.print2();
		
		
	}//main()

	
	public static void print1(){
		System.out.println("print1 Display");
	}
	
	public void print2(){
		System.out.println("print2 Display");
	}
	
	static{//초기화 블럭
		System.out.println("static 초기화 블럭");
	}
	
}//class
/*
	static : 프로그램 시작전에 먼저 메모리에 할당,초기화되고 프로그램 종료시에 소멸
	-초기화블럭 : static {~~} : main() 메서드보다 먼저 실행됨 , main()메서드보다 먼저 실행되야 할 것들은 static 메서드에 만들면 편함
*/