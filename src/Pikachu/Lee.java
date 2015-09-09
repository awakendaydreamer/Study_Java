package Pikachu;

public class Lee extends Character{
	public Lee() {
		exp = 20;
		energy = 30;
		level = 0;
		System.out.println("이상해 캐릭터가 생성되었습니다.");
		printInfo();
	}//lee()

	@Override
	public void eat() {
		energy += 5;
		
	}

	@Override
	public void sleep() {
		energy += 20;
	}

	@Override
	public boolean play() {
		energy -= 10;
		exp += 15;
		levelUp();
		return checkEnergy();
	}

	@Override
	public boolean train() {
		energy -= 10;
		exp -= 25;
		levelUp();
		return checkEnergy();
	}

	@Override
	public void levelUp() {
		if (exp >= 35) {
			level ++;
			exp -= 35;
			System.out.println("레벨업 되었습니다.");
		}//if
	}
}//class
