package Pikachu;

import java.util.Scanner;

public class PlayGame {
	private Character character;
	private int menu;
	private boolean exit;
	
	public PlayGame(Character character){				//②⑦
		this.character = character;
		
	}
	
	public void printMenu(Scanner sc){					//②⑧
		System.out.println("무엇을 할까요?");
		System.out.println("1.밥먹이기\t 2.잠재우기\t3.놀아주기");
		System.out.println("\t4.운동시키기\t5.종료하기 ▶");
	
		menu = sc.nextInt();
		play();
	
	}
	
	public void play(){									//②⑨
		switch(menu){
		case 1:
			character.eat();
			break;
		case 2:
			character.sleep();
			break;
		case 3:
			character.play();
			break;
		case 4:
			character.train();
			break;
		case 5:
			exit = true;
		}//switch
		character.printInfo();
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public boolean isExit() {
		return exit;
	}

	public void setExit(boolean exit) {
		this.exit = exit;
	}
	
	
}
