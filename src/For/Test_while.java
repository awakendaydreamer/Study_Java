package For;

public class Test_while {

	public static void main(String[] args) {
//1부터 10까지의 수 중에서 짝수의 합을 구하시오 : for, if
		
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
			System.out.println("for문 짝수의 합: " + sum);
		}
		
		
		
//1부터 10까지의 수 중에서 짝수의 합을 구하시오 : while, if
		
		int i = 1; // 초기화
		sum = 0; // 재할당
		while (i <= 10) { // 조건식
			if (i % 2 == 0) { // 실행문
				sum += i;

			}
			i++;
			System.out.println("while문의 짝수의 합: " + sum);
		}
		
		
		
		
		
		
		
	}

}
