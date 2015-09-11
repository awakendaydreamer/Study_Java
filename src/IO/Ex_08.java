package IO;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex_08 {

	public static void main(String[] args) {
		//키보드로부터 문자열을 여러번 입력받아 출력
		//버퍼를 활용(BufferedReader)
		//단, quit 문자열을 입력받으면 종료
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		while(true){
			System.out.print("여러 글자를 입력하세요 : ");
			try {
				String line = br.readLine();
//				if (line.compareTo("quit") == 0) {						//line == "quit"▶ 문자열은 비교연산을 수행할 수 없다.
//					System.out.println("종료되었습니다.");
//					break;
//				}
				
				if (line.equals("quit")) {
					System.out.println("종료되었습니다.");
					break;
				}
				
				System.out.println("입력하신 문자열은 " + line + "입니다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
