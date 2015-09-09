package Pikachu;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//①⑦
		Character character = null;				//②①
		PlayGame playGame = null;				//②⑤
		
		
		System.out.println("원하는 캐릭터를 선택하세요");	//①⑧
		System.out.println("1.피카추\t2.이상해씨\t3.꼬부기 ▶ ");//①⑨
		int c = sc.nextInt();	//②0
		
		switch(c){	//②①
		case 1:				////②②
			character = new Pikachu();
			break;
		case 2:
			character = new Lee();
			break;
		case 3:
			character = new Gobook();
			break;
		default:			//②③
		}//switch
		
		if (character == null) {
			System.out.println("게임을 종료합니다");
		}else{
			playGame = new PlayGame(character);
		}//if
		
		while(true){
			playGame.printMenu(sc);
			
			if (playGame.isExit()) {
				System.out.println("게임을 종료합니다");
				break;
			}//if
		}//while
		sc.close();
		
		
	}//main()

}//class
