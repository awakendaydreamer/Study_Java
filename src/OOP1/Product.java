package OOP1;

public class Product {
	//product Class → 상태정보(변수, 배열, ArrayList, 생성자, Getter/Setter)
	
		

	//멤버변수를 선언 ▶ DTO Class
	int num;		//제품번호
	String name;	//제품명
	
	//멤버메서드를 정의 ▶ DAO Class
	void print(){
		System.out.println("num : " + num);
		System.out.println("name : " + name);
	}

}//class
