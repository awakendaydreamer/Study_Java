package Operator;
public class Operator07 {
	public static void main(String[] args) {
		//삼항연산자 : 3개의 항으로 구성되는 연산자
		//간단한 조건을 판단할 경우 편리 → 실제 실무에서는 if ~~ else 구문을 사용
		/*3항연산자의 구성*/
		//조건식 ? 참값 : 거짓값 ;
		
		int a = 10;
		char c1 = a == 10?'O':'X';
		
		//①할당연산자부터 볼것 ▶ L-value = R - Value;
		//							a == 10 ? 'O' :'X';
		//							  조건식?     참  : 거짓
		
		
		System.out.println(c1);
	 /*---------------------------------------------------------------------------*/
		int b = 10;
		int b1 = b == 10 ? 'O' : 'X';
		
		System.out.println(b1);
		System.out.println((char)b1);
	
	/*--------------------------------------------------------------------------------*/
		char c2 = a != 10 ? 'O' : 'X';
		System.out.println(c2);
		
	/*--------------------------------------------------------------------------------*/	
		String result = a != 10 ? "맞다" : "틀리다";
		System.out.println(result);

	/*--------------------------실무 → 26번 행과 같다.-------------------------------*/
		if(a == 10){
			String dab = "맞다" ;
				System.out.println(dab);			
		} else{
			String dab = "틀리다" ;
				System.out.println(dab);
		} //End of if
		
		
	}

}
