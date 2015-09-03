package OOP1;

public class Book {
	//멤버변수 선언 → 상태정보 (DTO)
	String title,auth,pub;
	int price;
	
	
	//멤버메서드 정의 → 행위정보(DAO)
	void print(){
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
		System.out.println("저자 : " + auth);
		System.out.println("출판사 : " + pub);
		System.out.println("--------------");
	}//print()
}//class
