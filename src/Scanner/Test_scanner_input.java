package Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_scanner_input {
	public static void main(String[] args) {
		//사용자가 숫자(정수)를 여러번 입력(input) ▶  Scanner, while
		//단, -1이 입력되면 종료				  ▶if, break
		//종료되기 전까지 입력했던 숫자의 총합(sum), 갯수(cnt), 평균(avg)을 출력
		//단, 평균은 소수 둘째자리까지 표시 ▶ DecimalFormat
		
		//준비단계(객체생성, 변수초기화)
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00"); 
		int input = 0, sum = 0, cnt =0;
		float avg = 0;
		
		//처리단계(제어문, 연산자활용)
		while(true){
			System.out.println("숫자를 입력하세요. 종료는 -1을 입력하세요 :");
			input = sc.nextInt();
			if(input == -1){
				break;
			}
			
			sum += input;
			cnt ++;
			avg = (float)sum/cnt;
		}
		sc.close();
		//출력단계
		System.out.println("총합 : " + sum);
		System.out.println("개수 : " + cnt);
		System.out.println("평균 : " + df.format(avg));
		
//		int input = 0; 
//		
//		Scanner sc = new Scanner(System.in);
//			System.out.println("첫 번째 수를 입력하세요 : ");
//			int i = 0;
//			while(true){
//				System.out.println();;
//				i++;
//			}
		
		
		
		
		
	}//main()
}//class
