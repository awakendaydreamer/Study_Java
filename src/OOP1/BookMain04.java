package OOP1;

import java.util.Scanner;

public class BookMain04 {

	public static void main(String[] args) {
		//책 3권의 제목, 가격, 저자, 출판사를 입력받아 저장할 객체를 생성하고
		//객체에 저장된 내용을 출력(print())하시오.(for문 사용)
		Scanner sc = new Scanner(System.in);
		Book[] b = new Book[3];	//객체배열을 선언
		
		
		for (int i = 0; i < b.length; i++) {
			b[i] = new Book();	//객체배열 생성
			
			System.out.print("제목을 입력해 주세요 : ");
			b[i].title = sc.nextLine();
			System.out.print("가격을 입력해 주세요 : ");
			b[i].price = sc.nextInt();
			sc.nextLine();
			System.out.print("저자를 입력해 주세요 : ");
			b[i].auth = sc.nextLine();
			System.out.print("출판사를 입력해 주세요 : ");
			b[i].pub = sc.nextLine();
			
		}
		sc.close();
		
		for (int i = 0; i < b.length; i++) {
			b[i].print();
		}
		
		
	}//main()
}//class



/*
	객체배열을 생성할 경우 초기화하는 생성자 메서드 (class를 만들면  Book()메서드는 자동으로 생성자 메서드 만들어짐); → 자바에서 자동으로 제공
 	객체배열을 사용할 경우 Setter(입력), Getter(출력) 메서드 → 이클립스에서 자동으로 제공
 	
 	생성자메서드, Setter메서드, Getter메서드 ▶  DTO Class에서 만들어주고 묶는다.
 	DTO Class의 멤버변수(상태정보)는 정보은닉 → private String title;  
 *
 */
