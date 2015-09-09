package PlusMinusGame;

public class MathRandom {

	public static void main(String[] args) {
		int numDigit = 9;						//자릿수(9 → 일의자리, 99 → 십, 999 → 백)
		for (int i = 0; i < 10; i++) {
			int su1 = (int)(Math.random() * numDigit) + 1;
			System.out.println("su1의 값 : " + su1);
		
			int su2 = (int)(Math.random() * numDigit);
			System.out.println("su2의 값 : " + su2);
			
			System.out.println("==============구분선=============");
		}
		
	}//main()

}//class


/*
 	○ Math Class : JAVA에서 제공하는 수학 클래스 → API 문서 활용하여 검색
 		-random() : 난수를 발생하는 메소드 
 					0 ~ 1 사이의 수 중에서 임의의 실수(double)를 발생
 					
 					
 * 
 * 
*/
