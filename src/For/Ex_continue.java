package For;

public class Ex_continue {

	public static void main(String[] args) {
		//continue :continue문을 만나면,  continue문 다음 문장은 처리되지 않고
		//반복문의 첫 머리로 제어권을 옮기는것
		
		//1부터 10까지의 수 중에서 홀수의 총합(sum)을 구하시오 : for, if
		
		int sum =0;
		for (int i = 1; i <= 10 ; i++) {
			if(i % 2 != 0) {
				sum += i ;
				
			}//if
			
		}//for
		System.out.println("홀수의 합 :" + sum);
		
		
		//1부터 10까지의 수 중에서 훌수의 총합(sum)을 구하시오 : for, if , continue
		sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if(i % 2 == 0){				//짝수이면
				continue;				//반복문의 처음으로 되돌림
			}else{						//홀수이면
				sum += i;				//누적합을 계산
			}
			
		}//for
			System.out.println("홀수의 합 :" + sum);
		
		
		
		
		
	}//main()
}//class
