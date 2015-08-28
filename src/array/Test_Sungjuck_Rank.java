package array;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Test_Sungjuck_Rank {

	public static void main(String[] args) {
		//다섯과목(국어, 영어, 수학, 과학, 사회)의 점수를 입력받아 배열(jumsu)에 저장한다.  ▶ Scanner, for
		//각 과목의 점수 입력범위는 0~100이며,														 ▶while, if, continue, break
		//잘못된 점수가 입력되면 오류메세지를 출력하고 재입력 받는다.
		//입력받은 점수를 출력하고
		//총점(sum), 평균(avg), 최고점수(max), 최저점수(min)를 출력하시오.							▶Max, Min 알고리즘
		//단, 평균은 소수 둘째자리까지 표시하시오.														▶DecimalFormat
		
		//각 과목의 순위를 구하여 출력
		//
		
		
//준비단계
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int[] jumsu = new int[5];
		String[] part = {"국어", "영어", "수학", "사회", "과학"};
		int[] rank = new int[jumsu.length];
		
//과목의 점수를 입력받기.
		
		for (int i = 0; i < jumsu.length; i++) {
		
			while(true){
				System.out.print(part[i] + "점수를 입력하세요▶");
				jumsu[i] = sc.nextInt();
				
				if (jumsu[i] < 0 || jumsu[i] > 100) {
					System.out.println("0부터 100 사이의 점수를 입력하세요");
					continue;
				}//if
				break;
			}//while
		}//for i
		sc.close();
		System.out.println("입력하신 점수는 다음과 같습니다." + Arrays.toString(jumsu) );
		
//총점, 평균, 최고점수, 최저점수를 구한후 출력
		int sum = 0;
		for (int i = 0; i < jumsu.length; i++) {
			sum += jumsu[i];
		}
		float avg = 0;
			avg = (float)sum / part.length;
		System.out.println("과목점수 : " + sum);
		System.out.println("과목평균 : " + df.format(avg));
		
//최고점수와 최저점ㅈ수를 구한후 출력
		int max = jumsu[0];
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] > max) {
				max = jumsu[i];
			}//if
		}//for
		int min = max;
		for (int i = 0; i < jumsu.length; i++) {
			if (jumsu[i] < min) {
				min = jumsu[i];
			}//if
		}//for 
		System.out.println("최고점수 : " + max);
		System.out.println("최저점수 : " + min);
		
//순위(rank) 구하기		
		
		for (int i = 0; i < jumsu.length; i++) {
			int r = 1;
			for (int j = 0; j < rank.length; j++) {
				if(jumsu[i] < jumsu[j]){
					r += 1;
				}//if
			}//for j
			rank[i] = r;
		}//for i
		System.out.println("과목" + "\t" + "점수" + "\t" + "순위");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.println(part[i] + "\t" + jumsu[i] + "\t" + rank[i]);
		}//for i
		
	}//main()
}//class
