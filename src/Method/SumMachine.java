package Method;

import java.util.Scanner;

public class SumMachine {
	//makeSum(startNum, endNum) 호출
	//시작값과 종료값을 입력 받는다.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 점수를 입력하세요 ▶");
		int startNum = sc.nextInt();
		System.out.print("두 번째 점수를 입력하세요 ▶");
		int endNum = sc.nextInt();
		sc.close();
		
		
//		makeSum(startNum, endNum);		▶ 오류 : makeSum 메서드에 static 없다.(메모리에 생성이 안되서 접근X)
		SumMachine sm = new SumMachine()	;	//객체를 선언(생성)
		sm.makeSum(startNum, endNum);				//생성된 객체의 메서드를 호출
		
		
		
	}//main()
	
	
	//시작값 ~ 종료값까지 누적합을 구하고 출력하는 메서드 정의
	public  void makeSum(int startNum, int endNum){	//static 제거
		int sum = 0;
		for (int i = startNum	; i <= endNum; i++) {
			sum += i;
		}//for i
		System.out.println("시작값 : " + startNum);
		System.out.println("종료값 : " + endNum);
		System.out.println("누적합 : " + sum);
		
		
	}//makeSum()
}//class
