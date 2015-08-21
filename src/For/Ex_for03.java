package For;
public class Ex_for03 {
	public static void main(String[] args) {

/*------------------------------------FOR문과 if 문을 이용한 ---------------------*/
		//1부터 100까지의 수 중에서 홀수의 합(oddSum)과 짝수의 합(enenSum)을 출력
		//1부터 100까지의 수 중에서 홀수의 개수(oddCnt)와 짝수의 개수(evenCnt)를 출력
		
		int oddSum = 0, evenSum = 0;
		int oddCnt = 0, evenCnt = 0;
		int sum = 0;
		
		
		
		for (int i = 1; i <= 100; i++){
			if(i % 2 != 0){
				oddSum = oddSum + i;
			
			} else {
				evenSum = evenSum + i;
				
			}
		}//End of for
		
		System.out.println(oddSum);
		
		
		
		
		
		
	}

}
