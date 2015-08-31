package Method;

import java.util.Scanner;

public class BodyMassIndexMachine02 {

	public static void main(String[] args) {
//		main() 구현
//		-BodyMassIndexMachine 객체 생성(bmim)
//		-bmim.calculate(), bmim.getResult() 호출
//		===========================
//		★★★ 카우프 지수를 시작합니다★★★
//		시작 : Y, 종료 : X를 입력하세요 ▶ __		//data type
//		:char, charAt()
//			-잘못입력 : Y 또는 N 을 입력하세요
//			-N(n) 입력 : ★★★카우프 지수를 종료합니다★★★
//			-Y(y) 입력 : 신장, 체중 입력받는다, 비만지수, 건강상태를 출력하는 메서드 호출
	
		Scanner sc = new Scanner(System.in);
		BodyMassIndexMachine bmim = new BodyMassIndexMachine();
		
		while(true){
			System.out.println("★★★카우프 지수를 시작합니다★★★");
			System.out.print("시작 : Y, 종료 : N를 입력하세요 ▶ ");
			char userInput = sc.next().charAt(0);
			
			
			if (userInput != 'Y' && userInput != 'y' && userInput != 'N' && userInput != 'n') {
				System.out.println("Y 또는 N 을 입력하세요!!");
				continue;
			}
			
			if (userInput =='N' || userInput == 'n') {
				System.out.println("★★★카우프 지수를 종료합니다★★★");
				System.out.println("==========================");
				break;
			}
			
			System.out.print(" 신장을 입력하세요 (입력 예 : 175.5) ▶ ");
			float height = sc.nextFloat();
			System.out.print(" 체중을 입력하세요 (입력 예 : 65.5) ▶ ");
			float weight = sc.nextFloat();
			
			System.out.println("입력하신 신장은 " + height + "Cm 입니다.");
			System.out.println("입력하신 체중은 " + weight + "Kg 입니다."); 
			System.out.println("비만지수(카우프지수) : " + bmim.calculate(height, weight) ); //calculate()호출
			System.out.println("당신의 결과는 " +bmim.getResult(Float.parseFloat(bmim.calculate(height, weight)))+"입니다.");	//getResult()호출
		}//while
		sc.close();
	
	}//main()
}//class
