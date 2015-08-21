package For;

import java.util.Scanner;

public class Test_for03 {
	public static void main(String[] args) {

		
/*--------------------input/output >>I/O programming---------------------------------*/	
		//★★★두 수를 입력받아(startNum, endNum)
		//startNum부터 endNum까지의 홀수의 합(oddSum), 짝수의 합(evenSum), 총합을 구하여 출력
		//Scanner(입력), for(반복),if(홀짝을 판단)
		
		Scanner sc = new Scanner(System.in);	//Scannner 객체를 생성(입력받는다)                ★★★★★
	//	↑ Type  ↑name  ↑      ↑객체의 이름  ↑ 메서드
				//무조건 객체생성      					// 키보드에 입력되는 것을 sc에 저장해놓는다.
		System.out.print("첫 번째 수를 입력하세요 : " );
		int startNum = sc.nextInt();                 //입력받은 수를 startNum에 할당.				★★★★★
		//System.out.println("입력받은 첫 번째 수:" + startNum);
		
		System.out.println("두 번째 수를 입력하세요 :" );
		int endNum = sc.nextInt();
		//System.out.println("입력받은 두 번째 수:" + endNum);
		sc.close();
		
		
		int oddSum = 0, evenSum = 0;
	if(startNum < endNum){
		for(int i = startNum; i<= endNum; i++){
			if(i % 2 != 0){
				oddSum +=i;
			}else{
				evenSum += i;
			}
		}
	}else {
		for(int i = endNum; i<= startNum; i++){
			if(i % 2 != 0){
				oddSum +=i;
			}else{
				evenSum += i;
			}
		}
	}
		
		System.out.println("첫 번째 수 :" + startNum + "\t두 번째 수 :" + endNum	);
		System.out.println("홀수의 합 :" + oddSum + "\t짝수의 합:" + evenSum + "\t총 합 : " + (oddSum+evenSum));
		
		
		
		
	}

}
