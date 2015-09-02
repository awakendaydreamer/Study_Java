package OOP1;

public class Book {

	String title,auth,pub;
	int price;
	
	void print(){
		System.out.println("제목 : " + title);
		System.out.println("가격 : " + price);
		System.out.println("저자 : " + auth);
		System.out.println("출판사 : " + pub);
	}//print()
}//class
