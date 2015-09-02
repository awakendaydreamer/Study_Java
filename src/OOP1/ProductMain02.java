package OOP1;

public class ProductMain02 {

	public static void main(String[] args) {
	Product p1 = new Product();
	//product Class(상태정보)의 객체 p1을 생성 
	//p1이 사용할 메모리를 new 연산자로 할당받고, 생성자(product())
	p1.num = 1;		//p1의 맴버변수 num에 1을 할당(대입)
	p1.name = "컴퓨터";	//p1의 멤버변수 name에 컴퓨터를 할당(대입)
	
	Product p2 = new Product();
	p2.num = 2;
	p2.name = "노트북";
	
	Product p3 = new Product();
	p3.num = 3;
	p3.name = "세탁기";
	
	System.out.println("객체 p1의 정보");
	p1.print();
	System.out.println("------------");
	
	System.out.println("객체 p2의 정보");
	p2.print();
	System.out.println("------------");
	
	System.out.println("객체 p3의 정보");
	p3.print();
	System.out.println("------------");
	
	}//main()
}//class
