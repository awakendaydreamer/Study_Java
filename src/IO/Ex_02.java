package IO;

import java.io.InputStream;

public class Ex_02 {

	public static void main(String[] args) {
		InputStream is = System.in;
		System.out.print("영문자 1글자를 입력하세요 : ");
		
		try {
			int data = is.read();	//블럭킹메서드 : 사용자의 입력을 기다리는 상태
			System.out.println((char)data); //cast 연산자를 이용해서 형변환
			
			data = is.read();					//Enter → CR
			System.out.println(data);			//결과값 : ASCII Code 13
			System.out.println((char)data);		//결과값 : 화면에는 아무것도 표시되지 않는다.
			
			data = is.read();					//LF
			System.out.println(data);			//결과값 : Line Feed 10
			System.out.println((char)data);		//결과값 : 화면에는 아무것도 표시되지 않는다.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
/*
	- 사용자가 문자를 입력 → Enter (Carriage Return = CR) → line Feed
	- Enter Key를 입력하는 것은 프로그램의 종료가 아니다.▶ CR  / LF
	- 종료(Terminate) : Ctr + Z (Break 명령)
	- CR(Carriage Return) : 커서를 줄의 맨 앞으로 이동시
	- LF(Line Feed)	: 커서를 한줄 밑으로 이동

*/