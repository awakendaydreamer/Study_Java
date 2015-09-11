package IO;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_04 {

	public static void main(String[] args) {
		// 키보드로부터 한글 1글자를 입력받아 출력
		//InputStreamReader : "바이트" 입력 스트림을 "문자" 입력 스트림으로 변경하는 스트림
		//브릿지 스트림 : 필터스트림의 한 종류이므로 단독 사용 불가
		//new InputStreamReader(System.in);
		
		InputStreamReader isr = new InputStreamReader(System.in);	//브릿지 스트림
		System.out.print("한글 1글자를 입력하세요 : ");
		try {
			int data = isr.read();
			System.out.println("입력하신 글자는 " + data + "입니다."); //UniCode값이 출력
			System.out.println("입력하신 글자는 " + (char)data +" 입니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}//main()
}//class
