package String;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test_jumin {

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

	private static void birthday(String jumin) {
		int year = Integer.parseInt(jumin.substring(0,4));		//출생년도
		Date date = new Date();									//오늘 날짜와 현재시간 가져오기
//		System.out.println(date);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");	//년도만 4자리로 표시
		int age = Integer.parseInt(sdf.format(date)) - year + 1;//나이계산
		
		
		System.out.print("당신의 생년월일은 " + jumin.substring(0,4) + " 년 ");
		System.out.println(jumin.substring(4, 6) + " 월 " + jumin.substring(6) + " 일 입니다.");
		System.out.println("당신의 나이는 "+ age + " 세 입니다");
	}//birthday()
	
	
	
	
	
	
	
	
}
