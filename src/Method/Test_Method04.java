package Method;

import java.util.Scanner;

public class Test_Method04 {
	//임의의 두 정수를 입력받아(su1, su2)
	//입력받은 두 수 사이에서 2의 배수이면서 3의 배수인
	//값(수), 개수(cnt), 총합(sum)을 구하는 메서드(totalSum)를 호출
	//totalSum() 계산한 후 결과를 리턴(sum을)하는 메서드를 정의
	//리턴받은 결과(sum)를 출력
	public static void main(String[] args) {
		//임의의 두 정수를 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 : ");
		int su1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 : ");
		int su2 = sc.nextInt();
		sc.close();
		
		//메서드를 호출하고 결과를 출력
		System.out.println("첫 번째 정수 : " + su1  + "\t" + "두 번째 정수 : " + su2 ); 
		System.out.println("2의 배수이면서 3의 배수인 수의 총합 : " + totalSum(su1, su2) );
		
//		int cnt = totalSum(cnt);
	}//main()
	
	
	
	//매개변수로 전달받은 임의의 두 정수사이에서
	//2의 배수이면서, 3의 배수인 값(수), 개수(cnt)를 출력하고 총합을 구하여 리턴하는 메서드를 정의
	
	public static int totalSum(int su1, int su2){
		int sum = 0;
		int cnt =0;

		
		for (int i = su1; i <= su2 ; i++) {		//su1 부터 su2 까지 반복
			if (i % 2 == 0 && i % 3 == 0) {	//2의 배수이면서 3의 배수이면서
				
				cnt++;								//개수 증가
				sum += i;							//누적합
				System.out.print(i + " ");			//조건을 만족하는 값(수)을 출력
			}//if
		}//for i
		System.out.println("\n 2의 배수이면서 3의 배수인 수의 개수 : " + cnt);						
		
		
		return sum;
	}//totalSum()
}
