package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {

	public static void main(String[] args) {
		//3개의 길이(크기)를 갖는 정수형 배열 arr을 선언
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		//arr[3] = 40;
		//ArrayIndexOutOfBoundsException:3 미확인 예외
		
		System.out.println("배열 0 번지의 값 : " + arr[0]);
		System.out.println("배열 1 번지의 값 : " + arr[1]);
		System.out.println("배열 2 번지의 값 : " + arr[2]);
		//System.out.println("배열 3 번지의 값 : " + arr[3]);
		System.out.println("==========================");
		
		//String str1 = 100;	▶ error
		String str1 = "100";
		System.out.println(str1);
		int pstr = Integer.parseInt(str1);
		System.out.println(pstr);
		System.out.println("==========================");
		
		String str2 = "100a";
		System.out.println(str2);
		//int pstr2 = Integer.parseInt(str2);	//미확인 에러
		//System.out.println(pstr2);
		//NumberFormatException
		System.out.println("==========================");
		
		int x = 10;
		int y = 0;
		System.out.println(y/x);	//출력값 : 0
		//System.out.println(x/y);	//미확인 에러
		//ArithmeticException
		System.out.println("==========================");
		
		//"abc.txt" 파일을 읽어들이시오. → FileInputStream Class
		//FileInputStream fis = new FileInputStream("abc.txt");
		try {
			FileInputStream fis = new FileInputStream("abc.txt");
		} catch (Exception e) {	//FileNotFoundException : 확인예외를 Exception 으로 바꿔주면 모든 예외를 다 처리할수있음
			System.out.println("해당하는 파일이 존재하지 않습니다.");
			e.printStackTrace();
		}
		
		/*
		 	try{
		 		예외가 발생할 가능성이 있는 코드
		 	}catch(Exception){
		 		예외 발생 시 처리할 대안 코드
		 	}finally{						//▶ 생략가능
		 		무조건 실행하고 싶은 코드
		 	}
		 */
		
		
		
		
	}//main()
}//class

/*
 
	 [에러의 종류]
		 ① 하드웨어적인 에러 : 치명적인 에러 ▶ 프로그램이 실행 되지 않는다.
		 ② 소프트웨어적인 에러 : 가벼운 에러 ▶ 예외(Exception)의 다형성
		 	-SUN(Oracle)에서 모든 예외들을 클래스로 만들어서 제공한다.
		 	예)ArrayIndexOutOfBoundsException : 첨자가 잘못된 배열을 사용했다.
		 	예)ClassNotFoundException : 사용하고자하는 클래스가 없다.
 
  	[예외클래스의 분류]
	 	① 미확인 예외 : 컴파일 시점에서 예외처리를 하지 않아도 되는 클래스
	 		- 프로그램을 실행 해봐야 예외가 발생했는지 알 수 있다.
	 		- 프로그래머의 실수에 의한 예외 : 디버깅(오류수정)하기 쉽다.
	 	② 확인 예외 : 컴파일 시점에서 반드시 예외처리를 해야 되는 클래스 
	 		- try { ~~ } catch { ~~ } finally{ ~~ } : 예외처리를 반드시 할 것
 	
 	[예외 발생 시점]
	 	① 내가 만든 클래스 내부에서 로직을 구현하다가 ~~
	 	② 다른사람이 만든 라이브러리를 가지고 올때
 	
 	
 	
 */

