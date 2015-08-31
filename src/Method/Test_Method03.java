package Method;

import java.util.Scanner;

public class Test_Method03 {
	//임의의 정수 두개를 입력받아(su1, su2)
	//짝수의 합 (evenSum)과 홀수의 합(oddSum)을 구하는 메서드를 호출
	//evenSum, oddSum 메서드에서 계산한 후 결과를 리턴하는 메서드를 정의
	//리턴받은 결과를 출력
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//임의의 두 정수를 입력
		
		System.out.print("첫 번째 수를 입력하세요 : ");
		int su1= sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		sc.close();
		
		//결과를 출력, 메서드를 호출
		System.out.println("첫 번째 정수 : "+ su1 + "\t" + "두 번째 정수 : " + su2);
		System.out.println("짝 수의 합 : " + evenSum(su1, su2));
		System.out.println("홀 수의 합 : " +  oddSum(su1, su2));
	}//main()
	
	
	
	
	//짝수의 합을 구하는 메서드를 정의
	public static int evenSum(int su1, int su2){
		int evenSum = 0;
		for (int i = su1; i <=su2; i++) {
			if(i % 2 == 0 ){
				evenSum += i;
			}
		}
		return evenSum;
	}//evenSum()
	
	//홀수의 합을 구하는 메서드를 정의
	public static int oddSum(int su1, int su2){
		int oddSum = 0;
		for (int i = su1; i <=su2; i++) {
			if (i % 2 != 0) {
				oddSum += i;
			}
		}
		return oddSum;
	}//oddSum()
}//class
