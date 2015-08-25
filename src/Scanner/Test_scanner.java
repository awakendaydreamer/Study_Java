package Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_scanner {
	public static void main(String[] args) {
		//두 수(su1, su2)를 입력받은 후에 사칙연산을 수행하고 결과를 출력 : scanner
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수를 입력하세요 :");
		int su1 = sc.nextInt();
		System.out.print("두 번째 수를 입력하세요 :");
		int su2 = sc.nextInt();
		sc.close();
		
		DecimalFormat df = new DecimalFormat("0.#");
		//Decimalformat 객체 생성 → 수치데이터를 지정된 형식으로 변환하여 출력
		//(#,##0) : 단위설정
		
		
		System.out.println("첫 번째 수 :" + su1);
		System.out.println("두 번째 수 :" + su2);
		System.out.println("덧셈의 결과 :" + (su1 + su2));
		System.out.println("뺄셈의 결과 :" + (su1 - su2));
		System.out.println("곱셈의 결과 :" + (su1 * su2));
		System.out.println("나눗셈의 결과 :" + df.format((float)su1/su2));
		//나눗셈의 연산은 실수형의 결과가 나올 수 있다!!
		
	}//main()
}//class
