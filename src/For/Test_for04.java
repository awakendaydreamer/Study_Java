package For;
import java.util.Scanner;

public class Test_for04 {

	
	public static void main(String[] args) {
		//두 수를 입력받아(firstNum, secondNum) → Scanner
		//firstNum부터 secondNum까지의 3의 배수와 개수(cnt)를 출력하고
		//3의 배수의 종합(sum)을 구하시오 → for, if
		//단, firstNum과 secondNum의 대소관계를 비교하여 실행될 수 있도록 하시오 :if
		//① firstNum : 작은수입력, secondNum : 큰수입력
		//② firstNum : 큰수, secondNum : 작은수
		//③ firstNum, secondNum: 같은수 ▶ 오류메세지 출력
		
		int cnt = 0;
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수를 입력하세요 :" );
		int firstNum = sc.nextInt();
		System.out.println("입력받은 첫 번째 수:" + firstNum);
		
		System.out.print("두번째 수를 입력하세요:");
		int secondNum = sc.nextInt();
		System.out.println("입력받은 두 번째 수:" + secondNum);
		sc.close();
		
		
		
/*		if(firstNum>secondNum){
														//다중 if 생각을 못했다.		
		}
*/		
		
		for (int i = firstNum; i <=secondNum; i++){
			if(i%3 ==0){
				System.out.println("3의 배수 : " + i);
/*				sum = sum + i;							//sum을 구하는 방법을 몰랐음.*/
				cnt++;
			}//if
		}//for
				System.out.println("3의 배수의 개수 :" + cnt );
				
				
	
				
	
		
		
		
		
		
		
		
		
		
		
		
	/*	if(firstNum <secondNum){
			for(int i = startNum; i<= secondNum; i++){
				
			}
		}
	*/
		
		
		if (firstNum % 3 == 0){
			cnt++;
			System.out.println("첫번째 입력값중 3의 배수 : \n" + cnt);
		}
	
	
	}//End of main()
}//End of class
