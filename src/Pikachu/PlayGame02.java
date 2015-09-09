package Pikachu;

import java.util.Scanner;

public class PlayGame02 {
	
	public void playgame(Character character){					//⑬
		Scanner sc = new Scanner(System.in);					//⑭
		
		while(true){											//⑮
			System.out.println("무엇을 할까요?");
			System.out.println("1.밥먹이기\t 2.잠재우기\t 3.놀아주기\t");
			System.out.println("4.운동시키기\t 5.종료하기 ▶");
			
			int menu = sc.nextInt();							//①⑥
			
			if(menu == 1){												//①⑦
				character.eat();										//①⑧
				if(!character.checkEnergy()){								//②④
					System.out.println("에너지가 부족하여 캐릭터가 사망하였습니다.");
					break;
				}//if
			}else if(menu == 2){										//①⑨
				character.sleep();										//②ㅇ
				if(!character.checkEnergy()){								//②⑤
					System.out.println("에너지가 부족하여 캐릭터가 사망하였습니다.");
					break;
				}//if
			}else if(menu == 3){										//②①
				character.play();										//②②
				if(!character.checkEnergy()){								//②⑥
					System.out.println("에너지가 부족하여 캐릭터가 사망하였습니다.");
					break;
				}//if
			}else{														//②③
				System.out.println("게임을 종료합니다.");
			}//if
			character.levelUp();											//②⑦
			character.printInfo();											//②⑧
		}//while
		sc.close();															//②⑨
		
	}//playgame()
}//class
