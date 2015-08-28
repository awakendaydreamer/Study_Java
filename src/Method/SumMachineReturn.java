package Method;

import java.util.Scanner;

public class SumMachineReturn {
	//시작값과 종료값을 입력받는다.
	//makeSum(startNum, endNum) 호출하고 결과값을 return 받는다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 점수를 입력하세요 ▶");
		int startNum = sc.nextInt();
		System.out.print("두 번째 점수를 입력하세요 ▶");
		int endNum = sc.nextInt();
		sc.close();
		
		System.out.println("시작값 : " + startNum);
		System.out.println("종료값 : " + endNum);
//		System.out.println("누적합 : " + makeSum(startNum, endNum)); 	//오류 : static이 없음
		SumMachineReturn smr = new SumMachineReturn()	;					//객체를 생성(선언)

		System.out.println("누적합 : " + smr.makeSum(startNum, endNum));
		
	}//main()
	
	//시작값 ~ 종료값 까지의 누적합을 구하고 리턴하는 메서드 정의
	private  int makeSum(int startNum, int endNum){	 //static 제거, public → private 변경
		int sum = 0;
		for (int i = startNum; i <= endNum; i++) {
			sum += i;
		}//for i
	
		return sum;
	}//makeSum
	
	
}//class
