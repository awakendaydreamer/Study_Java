package If;
public class Ex_if_else_if {
	public static void main(String[] args) {

/*-------------------------------------다중 if ------------------------------*/
		/*
		  다중 if문 : 여러개의 조건을 판단하여 조건을 만족할 경우 실행
		  
		  if (조건식1){
		  		조건식1이 참일때 실행되는 문장;
		  }else if(조건식2){
		  			조건식2가 참일때 실행되는 문장;
		  }else if(조건식3){
		  			조건식3이 참일때 실행되는 문장;
		  }else {
		  			조건 1,2,3을 만족못했을때(거짓일때)실행되는문장;
		  }
		  
		 */
		
		int jumsu = 87;
		
		if(jumsu <= 90){
			System.out.println("너 A학점");
		}else if(jumsu <= 80){
			System.out.println("너 B학점");
		}else if(jumsu <= 70){
			System.out.println("너 C학점");
		}else if(jumsu <= 60){
			System.out.println("너 D학점");	
		}else {
			System.out.println("너 F학점");
		} //End of if
		
		
		
		
		
		
		
		
		
		
		
		
		
	} //End of main()

} // End of class
