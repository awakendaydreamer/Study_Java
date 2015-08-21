package For;

public class Ex_for02 {
	public static void main(String[] args) {

		// 1부터 10까지의 수 중에서 짝수만 출력 : for, if(단, 한 줄로 출력)

		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.print(i + "\n");
			}// End of if
		}// End of for

	
		//10부터 1까지의 수 중에서 홀수만 출력 : for, if(단, 한 줄로 출력)
		
		for (int i = 10; i>=1; i--){
			if (i % 2 != 0){
				System.out.print(i + "\t");
			}
		}
	
	
	}// End of main()
}// End of class
