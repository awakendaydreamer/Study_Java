package For;
public class Test_loop_gugudan {
	public static void main(String[] args) {
		//for, while,do~~while을 이용하여 구구단을 출력하는 프로그램을 완성하시오.가로 새로 상관없음
		//① for
		
		int i,j;
		System.out.println("for문을 이용한 구구단 =============================");
		for (i = 2; i <= 9 ; i++) {
			for (j = 1; j <= 9; j++) {
				System.out.print(i + "X" + j + "=" + i*j + "\t");	
			}//for j
				System.out.println();
			
			
		}//for i
		
		
		
		//② while
		System.out.println("while문을 이용한 구구단 ===========================");
		
		 i = 0;
		 while( i <= 9){
			 i++;
			 j = 0;
			 while( j<=9);{
				 j++;
			 }//while j
			 
			 System.out.print(i + "X" + j + "=" + i*j + "\t");
		 }//while i
		 	
		
		
		
		
		
		
		//③ do ~~ while
		System.out.println("do ~~ while문을 이용한 구구단 ========================");
		
		
		
		
		
		
		
		
		
		
		
	}//main()
}//class
