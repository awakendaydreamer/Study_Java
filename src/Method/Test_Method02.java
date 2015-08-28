package Method;

import java.util.Scanner;

public class Test_Method02 {
	//임의의 실수 2개를 입력받아 (su1, su2) hap 이라는 메서드를 호출하여
	//두 실수의 합(sum)을 구하여 리턴하는 메서드를 작성하시오
	//결과의 출력은 main method에서 작성하시오.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 : " );
		float su1 = sc.nextFloat();
		System.out.print("두 번째 수를 입력하세요 : ");
		float su2 = sc.nextFloat();
		
		System.out.println("첫 번째 실수 : " + su1);
		System.out.println("두 번째 실수 : " + su2);
		System.out.println("두 인수의 합 : " + hap(su1, su2));
		
	}//main()
	
	public static float hap(float x, float y){
	
			float sum = x + y;
			return sum;
	}//hap()
	
}//class
