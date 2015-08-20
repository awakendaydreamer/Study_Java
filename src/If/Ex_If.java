package If;
public class Ex_If {
	public static void main(String[] args) {
		/*
		 * 단순 If문 : 조건을 판단하여 참일 경우에만 실행
		 * ★ if(조건식){
		 * 		조건식이 참일때 실행되는 문장;
		 * }
		 * 
		 * ※실행되는 문장이 1줄이면 {}을 생략해도 된다.
		 * 	→ if(조건식) 실행문장;
		 */
	/*---------------코드작성은 변수로 만들고, 출력도 그대로 만들고---------------*/	
		int a = 10;
		boolean modData = a % 2 == 0;  //modData의 값 : true
		if(modData){
			System.out.println("입력값은 " + a + "입니다");
			System.out.println("입력값은 a 입니다");
			System.out.println(a + "은 짝수입니다.");
		}//End of if
	/* --------------코드작성은 한줄, 출력은 2줄-----------------------*/
		System.out.println("\n");
		
		int b =	9;	
		if(b % 2 !=0){//b를 2로 나눈 나머지 값이 0과 같지 않으면 true로 실행이 된다. → 홀수
			System.out.println("입력값은" + b + "입니다" + "\n" + b + "는 홀수입니다." );
		}//End of if
		
	/*----------------코드작성1줄 , 출력도 1줄--------------------------*/	
		System.out.println("\n");
		
		int c = 11;
		if(c%2!=0) System.out.println("임력값은" + c + "입니다.\n" + c + "은 홀수입니다.");
		
		
		
		
		
		
		
		
		
		
	}//End of main()
}//End of Class
