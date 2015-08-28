package Method;

import java.util.Scanner;

public class SumMachineReturnPrivate {
	//시작과 종료값을 입력받는다.
	//makeSum(startNum, endNum) 호출하고 결과값을 return받는다.
	//makeSum 메서드는 SumMachine.java, SumMachineReturn.java 클래스를 활용
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 점수를 입력하세요 ▶");
		int startNum = sc.nextInt();
		System.out.print("두 번째 점수를 입력하세요 ▶");
		int endNum = sc.nextInt();
		sc.close();
		
		System.out.println("시작값 : " + startNum);
		System.out.println("종료값 : " + endNum);
		
		SumMachine sm = new SumMachine(); 	//객체를 선언(생성) : SumMachine.java
		SumMachineReturn smr = new SumMachineReturn(); 	//SumMachineReturn.java
		
		sm.makeSum(startNum, endNum);		//return 문이 없다. : 메서드내에서 출력 완료
		//public ~~ makeSum() : 접근제어자가 public 선언 ▶ 외부에서도 사용 가능
		
//		System.out.println("누적합 : " + smr.makeSum(startNum, endNum));	//return 문이 있다.
		//private ~~ makeSum() : 접근제어자가 private 선언 ▶ 내부에서만 사용가능 
		
		
	}//main()
}//class
