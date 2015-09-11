package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_07 {

	public static void main(String[] args) {
		//한글 여러 글자를 입력받아 출력 → 버퍼(Buffer)활용
		InputStreamReader isr = new InputStreamReader(System.in);		//①
		
		//버퍼가 지원되는 스트림이 필요 : BufferedReader();
		BufferedReader br = new BufferedReader(isr);					//②
		
		//연쇄(chain,linkage)
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	//③
		
		System.out.println("한글 여러 글자를 입력하세요 : ");
		try {
			String line = br.readLine();								//readLine() : Enter 앞까지의 모든 문자를 한 번에 읽어온다. nextLine()과 비슷
			System.out.println(line);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}//main()
}//class

/*
	★ 버퍼의 필요성
	- 일반적인 입출력은 여러 글자를 입력한다 하더라도
	  실제 처리될 때에는 한글자씩 입출력이 된다.
	- 입력한 글자의 개수 만큼 접근이 이루어진다. ▶ 속도저하의 원인
	- 위와 같은 비 효율성을 개선하고자 여러 글자를 입력하더라도 버퍼(Buffer)를 이용하여
	  입력한 글자를 한 번에 입출력할 수 있돋록 지원해준다.
  	- 버퍼의 기본크기 : 1024byte ▶ BufferedReader();


*/