package PlusMinusGame;

import java.util.Scanner;

public class GameMain {
	static Scanner sc = new Scanner(System.in);									//29
	public static void main(String[] args) {
		int numDigit = 9;																//1 자릿수 지정
		String[] okMessage = {"첫번째 맞췄습니다", "두번째 맞췄습니다.","세번째 맞췄습니다"};			//2 정답메세지
		String[] errorMessage = {"첫번째 틀렸습니다.", "두번째 틀렸습니다.","세번째 틀렸습니다."}; 		//3 오답메세지
		opGame(new PlusOperator(), "==덧셈게임==", numDigit, okMessage, errorMessage);		//5
		opGame(new MinusOperator(), "==뺄셈게임==", numDigit, okMessage, errorMessage);	//7
		
	}//main()
	
	
	public static void opGame(Operator op, String title, int numDigit, String[] okMessage, String[] errorMessage){	//4												//4
		System.out.println(title); 														//6
		int okCnt = 0, noCnt = 0;														//8
		while(true){																//9
			OpArgs arg = op.getArgs(numDigit);											//10
			System.out.printf(op.getQuestion(), arg.a, arg.b); 							//28
			int userAnswer = sc.nextInt();												//30
			
			if(op.isEquals(userAnswer)){												//32
				System.out.println(okMessage[okCnt % 3]);									//33
				okCnt++;																	//34
			}else{																		//35
				System.out.println(errorMessage[noCnt % 3]);								//36
				noCnt++;																	//37
			}
			
			
			if (noCnt >= 3) {															//38
				System.out.println("===============================");
				System.out.println("게임을 종료합니다");											//39
				System.out.println("===============================");						//40
				break;																		//41
			}
		}	
		System.out.println("정답횟수 : " + okCnt);										//42
		System.out.println("오답횟수 : " + noCnt);										//43
	}//opGame()

}
