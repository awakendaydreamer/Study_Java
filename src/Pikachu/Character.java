package Pikachu;

public abstract class Character {	//①추상클래스 (abstract class)
	protected int exp;				//②member변수 선언
	protected int energy;
	protected int level;
	
	public abstract void eat();		//③추상 메소드 (abstract method)
	public abstract void sleep();
	public abstract boolean play();		//⑩ boolean type 으로 변경
	public abstract boolean train();
	public abstract void levelUp();
	
	public boolean checkEnergy(){	//⑧에너지체크  //⑩ boolean Type변경
		if (energy >= 0) {
			return true;
		}else{
			return false;
		}//if
	}//checkEnergy()
	
	public void printInfo(){	//⑨현재 상태의 캐릭터 정보를 출력
		System.out.println("=========================");
		System.out.println("현재 캐릭터의 정보를 출력합니다.");
		System.out.println("에너지 : " + energy);
		System.out.println("경험치 : " + exp);
		System.out.println("레벨 : " + level);
		System.out.println("=========================");
	
	}//printInfo()
	
	
}//class
