package Scanner;

import java.util.Scanner;

public class Ex_scanner {
	public static void main(String[] args) {
		//입력창에서 점수를 입력받은 후에 학점을 출력하는 프로그램: scanner(입력),if(학점)

		
//	Scanner();							//
//	new Scanner();						//Scanner 객체를 생성
//	new Scanner(System.in);  			//콘솔창에서 입력(System.in)
//	= new Scanner(System.in); 			//할당
//	sc = new Scanner(System.in);		//이름생성	
//★	Scanner sc =new Scanner(System.in); //타입선언	
		
	Scanner sc = new Scanner(System.in);	
	System.out.print("점수를 입력하세요 : ");	
//	sc.											//sc입력받음
//	sc.nextInt();								//next는 한글입력받은것을 인트타입으로 변경
//												//↑블럭킹상태(콘솔로부터 입력받기를 대기하고 있는 상태) 	
//	jumsu = sc.nextInt();						//변수에 담아서 메모리가 기억하고있을수있는상태	
//★	int jumsu = sc.nextInt();					//		

	
	int jumsu = sc.nextInt();
	sc.close();
	System.out.println("입력하신 점수는 " + jumsu + "점 입니다." );
	
/*-------------------------------------------------------------------------------*/
	
	if(jumsu >= 90){
		System.out.println("당신의 학점은 A학점 입니다.");
	}else if(jumsu >= 80){
		System.out.println("당신의 학점은 B학점 입니다.");
	}else if(jumsu >= 70){
		System.out.println("당신의 학점은 C학점 입니다.");
	}else if(jumsu >= 60){
		System.out.println("당신의 학점은 D학점 입니다.");
	}else {
		System.out.println("당신의 학점은 F학점 입니다.");
	}//if
	
	
	
	
	
	
	
	}//main()
}//class
