package array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Test_Sungjuck_Max_Min {

	public static void main(String[] args) {
		//다섯과목의 점수를 입력받아 배열(jumsu)에 저장한다.
		//각 과목의 점수 입력범위는 0~100
		//잘못된 점수가 입력되면 오류메세지를 출력하고, 재입력 받는다.
		//입력이 완료되면 사용자가 입력한 점수를 출력하고,
		//총점(sum), 평균(avg), 최고점수(max), 최저점수(min)를 출력하시오.
		//단, 평균은 소수 둘째자리까지 표시.
		//준비단계 → 과목점수입력&출력 →  총점,평균 → 최고,최저
		
		
		//준비단계 : Scanner, DecimalFormat 객체생성, jumsu[] 선언
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int[] jumsu = new int[5];
		String[] part = {"국어","영어","수학","과학","사회"};
	
		
		//과목점수를 입력받은 후 출력한다.
		
		
		for (int i = 0; i < jumsu.length; i++) {
			
			while(true){
//				System.out.print(i + 1 + "번째 과목점수를 입력하세요(0~100) : ");
				System.out.print(part[i] + "점수를 입력하세요(0~100)▶");
				jumsu[i] = sc.nextInt();
//				System.out.println("입력하신 점수는 : " + jumsu[i]);
//				
//				if(jumsu[i] != 4){
//					continue;
//				}
				
				if(jumsu[i] < 0 || jumsu[i] > 100){
					System.out.println("0부터 100 사이의 점수를 다시 입력하세요 ▶");
					continue;
				}
				break;
			}//while

			
		}//for
		sc.close();
		System.out.println("입력하신 점수는 다음과 같습니다 :" + Arrays.toString(part));
		System.out.println("입력하신 점수는 다음과 같습니다 :" + Arrays.toString(jumsu));
		
		
		//총점, 평균, 최고점수, 최저점수를 구한 후 출력한다.
		
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum = sum + jumsu[i];
		}
		float avg = (float)sum / part.length;
		System.out.println("과목총점 : "+ sum);
		System.out.println("과목평균 : " + df.format(avg)); 
				
		//최고점수와 최저점수를 구한 후 출력한다.
		int max = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] > max) {
				max = jumsu[i];
			}//if
		}//for
		int min =max;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] < min) {
				min = jumsu[i];
			}//if
		}//for
		
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		
		
		
	}//main()
}//class
