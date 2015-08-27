package Scanner;

import java.util.Random;
import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {

//		게임시작 : 1, 게임종료 : -1		
		
//		userNum(1~6) : 직접입력 ▶ Scanner
//		comNum(1~6)  : 랜덤할당 ▶ Random 
		
//		userNum > comNum : user Win!!
//		userNum < comNum : 		Lose
//		userNum = comNum : 		Draw
		

		//준비도구
		Scanner scanner = new Scanner(System.in);	//입력개체
		Random random	= new Random();			//랜덤객체
//		int userNum = random.nextInt(6);
//		System.out.println(userNum);
		
		
		//게임시작
		while(true){
			System.out.print("게임시작 : 1, 게임종료 : -1을 입력하세요 ▶");
			int userInput = scanner.nextInt(); //1,-1
			scanner.nextLine();					//숫자입력완료
			
			//1,-1이외의 숫자가 입력되면 재입력
			if(userInput !=1 && userInput !=-1 ){
				System.out.println("숫자를 잘못 입력하셨습니다.");
			}
			
			//-1이 입력되면 게임을 종료(while문 탈출 break)
			if(userInput == -1){
				System.out.println("게임을 종료합니다.");
				break;
			}//if
			
			//인사말
			System.out.println("안녕하세요 ^_^");
			System.out.println("D I C E G A M E ! ! !");
			
			//사용자가 주사위를 굴린후 랜덤으로 주사위 숫자를 할당
			System.out.println("주사위를 굴려 볼까요?");
			System.out.print("Enter Key를 입력하세여");
			scanner.nextLine();
			int userNum = random.nextInt(6) + 1 ;
			System.out.println("당신의 숫자는" + userNum + "입니다.");
			
			//컴퓨터가 주사위를 굴린 후 랜덤으로 주사위 숫자를 할당
			System.out.println("컴퓨터가 주사위를 굴립니다.");
			System.out.print("Enter Key를 입력하세여");
			scanner.nextLine();
			int comNum = random.nextInt(userNum + 1);
			System.out.println("컴퓨터의 숫자는" + comNum + "입니다.");
			
			//userNum과 comNum을 비교해서 결과를 출력
			if(userNum > comNum	){
				System.out.println("You Win!!");
			}else if(userNum < comNum	){
				System.out.println("You Lose!!");
			}else{
				System.out.println("DRAW!!");
			}//if
			
		}//while
		
	}//main()
}//class
