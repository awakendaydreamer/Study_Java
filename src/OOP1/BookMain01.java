package OOP1;

public class BookMain01 {

	public static void main(String[] args) {
		//객체를 생성하고 입력(할당)한다.
		Book book1 = new Book();	//b1 : 인스턴스(instance)변수, 포인터변수, 레퍼런스변수, 참조변수
		book1.title = "JAVA";
		book1.price = 30000;
		book1.auth = "강요천";
		book1.pub = "프리렉";
		
		
		Book book2 = new Book();
		book2.title = "JSP";
		book2.price = 32000;
		book2.auth = "홍길동";
		book2.pub = "한빛미디어";
		
		
		Book book3 = new Book();
		book3.title = "Android";
		book3.price = 28000;
		book3.auth = "박민성";
		book3.pub = "더조은";
		
		
		//출력 → 멤버메서드 호출
		book1.print();
		book2.print();
		book3.print();
		
	}//main()
}//class
