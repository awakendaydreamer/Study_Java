package String;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test_jumin02 {

	private static void birthday(String jumin) {
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록 번호를 입력하세요 : ");
		String input = sc.nextLine();
		
//		Integer.parseInt()
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
		
		
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String jumin = null;
		
		while(true){
			System.out.println("생년월일 8자리를 입력하세요 : ");
			jumin = sc.nextLine();
			System.out.println("입력하신 생년월일은" + jumin + "입니다.");
			System.out.println("맞으면 Y, 틀리면 N을 입력하세요.");
			String input = sc.nextLine();
			
			if (input.toUpperCase().compareTo("Y") == 0) {
				birthday(jumin);
				break;
			}else if(input.equalsIgnoreCase("N")){
				continue;
			}else{
				System.out.println("Y또는 N을 입력하세요.");
				continue;
			}//if
		}//while
		sc.close();
	}//main()
}
