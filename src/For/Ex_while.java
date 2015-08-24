package For;

public class Ex_while {

	public static void main(String[] args) {
		/*
		  while : 반복횟수를 모를 경우 사용(선조건 → 후처리)
		  
		  초기값 설정;
		 while(조건식){
		 	조건식이 참일때 처리되는 문장(실행문);
		 	증감식;
		 }
		  
		 */

		/*-----1부터 10까지의 총합(sum)을 출력 : for-----*/
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}//for
		System.out.println("for총합 : " + sum);
		
		
		/*-----1부터 10까지의 총합(sum)을 출력 : while-----*/
		
		int i = 1; 		//초기화
		sum = 0;		//재할당
		while(i<=10){	//조건식
			sum += i;	//실행문
			i++;		//증감식
			
		}//while
		System.out.println("for종합 : " + sum);
		
		
		
		
		
	}//main()

}//class
