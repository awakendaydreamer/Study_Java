package Pikachu;

import java.util.Scanner;

public class GameMain02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		//①
		Character character = null;					//⑥
		PlayGame02 pg = new PlayGame02();							//⑨
		
		System.out.println("원하는 캐릭터를 선택하세요");	//②
		System.out.println("1.피차큐 \t 2.이상해씨 \t3.꼬부기 ▶");	//③
		int c = sc.nextInt();						//④
		
		if (c == 1) {								//⑤
			character = new Pikachu();
			pg.playgame(character);;											//⑩
		}else if (c == 2){							//⑥
			character = new Lee();
			pg.playgame(character);											//⑪
		}else if (c == 3){							//⑦
			character = new Gobook();
			pg.playgame(character);											//⑫
		}else{										//⑧
			System.out.println("잘못 선택했습니다.");
		}
		
	}

}
