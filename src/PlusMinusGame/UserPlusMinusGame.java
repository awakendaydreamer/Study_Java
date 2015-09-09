package PlusMinusGame;

import java.util.Scanner;

public class UserPlusMinusGame {
	Scanner sc = new Scanner(System.in);								//⑭

	public static void main(String[] args) {
		UserPlusMinusGame upmg = new UserPlusMinusGame(); 		//③
//		upmg.plus();											//④
		upmg.minus();											//⑤
	}//main()
	
	public void plus(){											//①
		int okCnt = 0, noCnt =0;
		String[] okMessage = {"띵동 ~~ ^^", "잘하네~~", "어쭈구리"};		//⑥
		String[] errorMessage = {"ㅠㅠ","흐미","다음 기회에"};				//⑦
		while(true){												//⑧
			int numDigit = 9;										//⑨
			int a = (int)((Math.random()*numDigit) + 1);			//⑩
			int b = (int)((Math.random()*numDigit) + 1);			//⑪
			int systemAnswer = a + b;								//⑫
			
			System.out.println(a + "+" + b + "=" );					//⑬
			int userAnswer = sc.nextInt();								//⑮
			
			if (systemAnswer == userAnswer) {							//16
				System.out.println(okMessage[okCnt % 3]);				//17
				okCnt++;												//18
			}else{														//19
				System.out.println(errorMessage[noCnt % 3]);			//20
				noCnt++;												//21
			}//if
			if (noCnt >= 3) {											//22
				break;													//23
			}
		}//while
		System.out.println("정답횟수 : " + okCnt);							//24
		System.out.println("오답횟수 : " + noCnt);							//25
	}//plus()
	public void minus(){										//②
		int okCnt = 0, noCnt = 0;
		String[] okMessage = {"첫번째 맞춤", "두번째 맞춤", "세번째 맞춤"};
		String[] errorMessage = {"첫번째 틀림", "두번째 틀림", "세번째 틀림"};
		
		while(true){
			int numDigit = 9;
			int a = (int)(Math.random() * numDigit) + 1;
			int b = (int)(Math.random() * numDigit) + 1;
			if (a <= b) {
				 b = (int)(Math.random() * numDigit) + 1;
			}
			
			int systemAnswer = a - b;								//⑫
			
			System.out.println(a + "-" + b + "=" );					//⑬
			int userAnswer = sc.nextInt();								//⑮
			
			if (systemAnswer == userAnswer) {							//16
				System.out.println(okMessage[okCnt % 3]);				//17
				okCnt++;												//18
			}else{														//19
				System.out.println(errorMessage[noCnt % 3]);			//20
				noCnt++;												//21
			}//if
			if (noCnt >= 3) {											//22
				break;													//23
			}
		}//while
		System.out.println("정답횟수 : " + okCnt);							//24
		System.out.println("오답횟수 : " + noCnt);							//25
			
		
	}//minus()

}

