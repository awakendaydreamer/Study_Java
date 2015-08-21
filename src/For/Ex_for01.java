package For;
public class Ex_for01 {
	public static void main(String[] args) {
/*--------------------------------반복문------------------------------------*/
		//0부터 10까지 출력하시오.
		//System.out.println(0);
		//System.out.println(1);
		//System.out.println("syso(1~10)반복시킨다");
		
/*
 * 반복문(순환문,Loop문) : for, while, do ~~ while
 * for(초기값 ; 조건식(최종값); 증감값) {
 * 		실행문(반복할 문장) 
 * }		
 */
		
		for (int i = 0; i<=10; i++){
			System.out.println(i);
		}
		for (int a = 99; a<= 999; a++){
			System.out.println(a);
		}
		
		
	//0부터 10까지의 수 중에서 짝수만 출력	
		for(int i = 0; i<=10; i = i+2){    // i += 2
			System.out.println(i);
		}
		
	//0부터 10까지의 수 중에서 홀수만	
		for (int i = 0; i<=10; i++){
			if( i % 2 == 1){ 				//(i%2 !=0)
				System.out.println(i);
			}else if(i <= 5 ){
				System.out.println("5이하의 짝수 : " + i);
			}
		}
	
	//0부터 10까지의 수 중에서 짝수를 역순으로 출력 : for문만 사용
		for(int i =10; i>=1; i++ ){
			
		}
	
		
		
		
	//10부터 1까지 출력 : for문만 사용
		for (int i = 10; i<=0; i--){
			System.out.println(i);
		}
		
		
	//1부터 10까지의 수 중에서 홀수를 역순으로 출력 : for, if	
		for (int i = 10; i >= 1 ; i--){
			if (i%2 != 0){
				System.out.println(i);
			}//End of if
		}//End of for
	}//End of main()
} //End of class
