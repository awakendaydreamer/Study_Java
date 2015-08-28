package Method;

import java.util.Scanner;

public class Test_Method01 {

	public static void main(String[] args) {
		//1 ~ 50 까지의 누적합 : a ~ b
		//51 ~ 100 까지의 누적합 : c ~ d
		//1 ~ 100 까지의 누적합 : a ~ d

		int a = 1, b = 50, c = 51, d = 100;			//인수값을 초기화
		hap(a,b);											//1~50 누적합을 구하는 메서드(hap) 호출 ▶ 실인수
		hap(c,d);											//51~100 누적합을 구하는 메서드(hap) 호출 ▶ 실인수
		hap(a,d);											//1~100 누적합을 구하는 메서드(hap) 호출 ▶ 실인수
	
		//두 수를 입력받아(su1, su2) 누적합을 구하는 메서드 (hap) 호출 ▶ 실인수
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		hap(su1, su2);
		
		
	}//main()
	
//두 개의 정수를 입력받아 누적합을 구하는 메서드(hap) 정의
	public static void hap(int x, int y) {			//인수(매개변수,parameter) ▶ 가인수
		int sum = 0;
		for (int i = x; i <= y; i++) {
			sum += i;
		}
		System.out.println(x + "부터" + y + "까지의 총합 : " + sum);
	}//hap()
	
}//class
