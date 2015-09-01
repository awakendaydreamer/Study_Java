package Algorithm;

import java.util.Scanner;

public class Ex_Cnt {

	public static void main(String[] args) {
		//두 개의 정수를 입력받아 두 수 사이의 정수의 개수를 입력 
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 정수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 정수를 입력하세요 : ");
		int su2 = sc.nextInt();
		sc.close();
		
		int cnt = 0;	//개수를 저장할 변수 cnt를 초기화
		for (int i = su1; i <= su2; i++) {
//			cnt = cnt +1;	//개수 구하기
			cnt++;
			
		}//for i
		System.out.println("첫 번째 정수 : " + su1);
		System.out.println("두 번째 정수 : " + su2);
		System.out.println("두 수 사이의 정수의 개수 : " + cnt);
		
	}//main()
}//class
