package Pikachu;

public class Pikachu extends Character {	//④ 상속(extends) : Pikachu → Character
	public Pikachu(){	//⑤ 디폴트 생성자 메서드 : 경험치(exp), 에너지(energe), 레벨(level) 초기화
		exp = 30;		//⑥ 변수의 초기값주기 (type이 없다 why? 아버지에게 상속받았으므로) 
		energy = 50;
		level = 0;
		System.out.println("피카추 캐릭터가 생성되었습니다.");
		printInfo();
	}//pikachu()

	@Override
	public void eat() {
		energy += 10;
		
	}

	@Override
	public void sleep() {
		energy += 5;
	}

	@Override
	public boolean play() {
		energy -= 20;
		exp += 5;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 10;
		exp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if (exp >= 40) {
			level++;
			exp -= 40;
			System.out.println("level up 되었습니다.");
		}//if
	}
}//class
