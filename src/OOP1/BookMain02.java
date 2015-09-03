package OOP1;

import java.util.Scanner;

public class BookMain02 {

	public static void main(String[] args) {
		//책 3권의 제목, 가격, 저자, 출판사를 입력받아 저장할 객체를 생성하고
		//객체에 저장된 내용을 출력(print())하시오.
		
		
		
		
		//객체생성 : 3개
		Book b1 = new Book();
		Book b2 = new Book();
		Book b3 = new Book();
		
		
		//입력을 받아 멤버변수에 저장(할당)
		Scanner sc = new Scanner(System.in);
		System.out.print("제목을 입력해 주세요 : ");
		b1.title = sc.nextLine();
		System.out.print("가격을 입력해 주세요 : ");
		b1.price = sc.nextInt();
		sc.nextLine();
		System.out.print("저자를 입력해 주세요 : ");
		b1.auth = sc.nextLine();
		System.out.print("출판사를 입력해 주세요 : ");
		b1.pub = sc.nextLine();
		
		System.out.print("제목을 입력해 주세요 : ");
		b2.title = sc.nextLine();
		System.out.print("가격을 입력해 주세요 : ");
		b2.price = sc.nextInt();
		sc.nextLine();
		System.out.print("저자를 입력해 주세요 : ");
		b2.auth = sc.nextLine();
		System.out.print("출판사를 입력해 주세요 : ");
		b2.pub = sc.nextLine();
		
		System.out.print("제목을 입력해 주세요 : ");
		b3.title = sc.nextLine();
		System.out.print("가격을 입력해 주세요 : ");
		b3.price = sc.nextInt();
		sc.nextLine();
		System.out.print("저자를 입력해 주세요 : ");
		b3.auth = sc.nextLine();
		System.out.print("출판사를 입력해 주세요 : ");
		b3.pub = sc.nextLine();
		
		sc.close();
		
		//객체에 저장된 내용을 출력 : 멤버메서드(print)호출
		b1.print();
		b2.print();
		b3.print();
		
		
		
		

	}

}
