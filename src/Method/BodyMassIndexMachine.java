package Method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BodyMassIndexMachine {

	public static void main(String[] args) {
		//신장(height) 과 체중(weight)을 입력( 예 : 175.5, 65.5)
		Scanner sc = new Scanner(System.in);
		System.out.println(" 신장을 입력하세요 (입력 예 : 175.5) ▶ ");
		float height = sc.nextFloat();
		System.out.println(" 체중을 입력하세요 (입력 예 : 65.5) ▶ ");
		float weight = sc.nextFloat();
		sc.close();
		//결과를 출력
		System.out.println("입력하신 신장은 " + height + "Cm 입니다.");
		System.out.println("입력하신 체중은 " + weight + "Kg 입니다."); 
		System.out.println("비만지수(카우프지수) : " + calculate(height, weight) ); //calculate()호출
		System.out.println("당신의 결과는 " +getResult(Float.parseFloat(calculate(height, weight)))+"입니다.");	//getResult()호출
		
		
	}//main()

	
	//비만지수 (카우프 지수)를 구하는 메서드를 정의(소수 둘째자리까지표시)
	public static String calculate(float height, float weight){
		float hh = (height/100) * (height /100);	//신장의 제곱
		float result = weight/hh;						//체중을 나눈다.
		DecimalFormat df = new DecimalFormat("0.00");
		
		
		return df.format(result);
	}//calculate()
	
	//비만지수를 기준으로 건강상태를 구하는 메서드를 정의
	public static String getResult(float index){
		String result = null;	//최종 결과를 저장할 문자열 변수(result)를 초기화(null)
		if(index>= 30){
			result ="비만";
		}else if (index >= 24){
			result = "과체중";
		}else if (index >= 20){
			result = "정상";
		}else if (index >= 15){
			result = "저체중";
		}else if (index >= 13){
			result = "여윔";
		}else if (index >= 10){
			result = "영양 실조증";
		}else if (index < 10){
			result = "소모증";
		}
//		for (int i = 0; i <= cal ; i++) {		
//			if(i >= 30 ){
//				System.out.println("비만.");
//			}else if(i>=24 ){
//				System.out.println("과체중");
//			}else if(i>= 20){
//				System.out.println("정상");
//			}else if(i>=15){
//				System.out.println("저체중");
//			}else if(i>=13){
//				System.out.println("여윔");
//			}else if(i >= 10){
//				System.out.println("영양 실조증");
//			}else {
//				System.out.println("소모증");
//			}//if
//			break;
//			
//			
//		}//for i
		return result;
	}//getResult()
	
}//class
