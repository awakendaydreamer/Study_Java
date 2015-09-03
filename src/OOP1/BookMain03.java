package OOP1;

import java.util.Scanner;

public class BookMain03 {

	public static void main(String[] args) {
		//책 3권의 제목, 가격, 저자, 출판사를 입력받아 저장할 객체를 생성하고
		//객체에 저장된 내용을 출력(print())하시오.(for문 사용)
				
		
		
		Scanner sc = new Scanner(System.in);
		
		
		for (int i = 1; i <= 3 ; i++) {
			Book b = new Book(); //객체 생성
			
			System.out.print("제목을 입력하세요 : ");
			b.title = sc.nextLine();
			System.out.print("가격을 입력하세요 : ");
			b.price = sc.nextInt();
			sc.nextLine();
			System.out.print("저자를 입력하세요 : ");
			b.auth = sc.nextLine();
			System.out.print("출판사를 입력하세요 : ");
			b.pub = sc.nextLine();
			
			b.print();
		}//for
		sc.close();
	}//main()

}//class
