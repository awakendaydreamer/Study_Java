package PlusMinusGame;

import java.util.Random;

public class Ex_Random {

	public static void main(String[] args) {
		Random random = new Random();
		int value = random.nextInt();	//int type의 정수를 반환
		System.out.println(value);
	
		for (int i = 0; i < 10; i++) {
			value = random.nextInt(10); //seed 값을 줬다 : 0~9 사이의 난수를 발생
			System.out.println(value);
		}//for i
	
	System.out.println("============구분선===============");
		//0~9 사이에서 임의의 수 두개 (su1, su2)를 출력하시오.
		int su1 = random.nextInt(10);
		int su2 = random.nextInt(10);
		System.out.println("su1의 값 : " + su1 );
		System.out.println("su2의 값 : " + su2 );
		
		
	}//main()

}
