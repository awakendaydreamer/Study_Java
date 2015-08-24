package For;

public class Test_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1 부터 10까지의 수 중에서 홀수의 합(oddSum), 짝수의 합(evenSum)
		//총합(totalSum)을 구하시오 : for, if ~~ else
		
		int oddSum = 0, evenSum =0,totalSum = 0;
		for (int i = 1; i <= 10; i++) {
			if(i % 2 != 0){
				oddSum += i;
			
			}else{
				evenSum +=i;
				
			}//if
			totalSum = oddSum + evenSum;
			
		}//for
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 :" + evenSum);
		System.out.println("총합 : " + totalSum);
		
		
		
		//1부터 10까지의 수 중에서 홀수의 합(oddSum),짝수의 합(evenSum)
		//총합(totalSum)을 구하시오 : for, if , continue
																																																							
		oddSum = 0; evenSum = 0; totalSum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 != 0) {		//홀수이면
				oddSum += i;		//홀수의 누적합
				continue;			//반복문의 처음으로
			}
			evenSum += i;			//짝수의 누적합
			
			
		}//for
		totalSum = oddSum + evenSum; //총합
		System.out.println("홀수의 합 : " + oddSum);
		System.out.println("짝수의 합 :" + evenSum);
		System.out.println("총합 : " + totalSum);
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main()
}//class
