package For;

public class Ex_do_while {

	public static void main(String[] args) {

		/*
		  do ~~ while : 선처리 → 후조건
		  ※ 조건이 처음부터 거짓이더라도 실행문(do)은 최소 1번은 실행
		  
		  초기값;
		  do{
		  	조건이 참일때 실행되는 문장;
		  	증감식;
		  }while(조건식);	
		  
		 */
		
// 1부터 10까지의 수 중에서 짝수(sum)의 합을 구하시오.
		
		int i = 1, sum = 0;		//초기화
		
		do{
			if(i % 2 == 0 ){	//실행문
				sum += i;		
			}//if
			i++;				//증감식
		} while(i<=10);			//조건식
		System.out.println("짝수의 합:" + sum);
		
		
		
		
		
		
		
		
		
		
	}//main()
}//class
