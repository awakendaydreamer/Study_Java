package Method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_Method05 {

	public static void main(String[] args) {
		//임의의 두 정수를 입력받는다. (su1, su2)
		Scanner sc = new Scanner(System.in);
		
	
		System.out.print("첫 번째 수를 입력해 주세요 ▶");
		int su1 = sc.nextInt();
		System.out.print("두 번째 수를 입력해 주세요 ▶");
		int su2 = sc.nextInt();
		
		//결과를 출력
		System.out.println("첫 번째 수 : " + su1);
		System.out.println("두 번째 수 : " + su2);
		System.out.println("덧셈의 결과 : " + add(su1, su2) );
		System.out.println("뺄셈의 결과 : " + sub(su1, su2));
		System.out.println("곱셈의 결과 : " + mul(su1, su2));
		System.out.println("나눗셈의 결과 : " + div(su1, su2));
		System.out.println("=======================");
		System.out.println(div(su1, su2) + 1); //결과값 : 4.33(X)  3.331(O) concatenate(결합연산)▶ div() 리턴타입이 String 
//"10" + 10 = 1010
//Integer.parseInt("10") + 10 = 20
		System.out.println(Float.parseFloat(div(su1, su2)) + 1); //Wrapper Class : 연산 가능
		
	}//main()
	
	//입력받은 두 점수를 이용해서 사칙연산을 수행하고 결과를 리턴하는 메서드 정의
	//단, 나눗셈의 연산결과는 소수 둘째자리까지 표시
	public static int add(int x, int y){
		int result	 = x + y;
		
			
		
		return result;
	}//add()
	
	public static int sub(int x, int y){
		int result = x - y;
		
		return result;
		
	}//sub()
	
	public static int mul(int x, int y){
		int result = x * y;
		
		return result;
		
		
	}//mul()
	
	public static String div(int x, int y){
		
		DecimalFormat df = new DecimalFormat("0.00");
//		float result =  (float)x /y;
//		return df.foramt(result);		
		String result = df.format((float)x / y);	//나눗셈의 결과는 실수형 자료
		return result;								//DecimalFormat 사용하면 String Type 변환 ▶ return type : String
	}//div()
}//class
