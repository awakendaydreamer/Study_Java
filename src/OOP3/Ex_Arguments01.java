package OOP3;

public class Ex_Arguments01 {

	public static void main(String[] args) {
		try {
			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[0] + args[1]);	//문자열은(String)결합 : Concatenate
			System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1])); //Plus 연산 : Wrapper Class

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("명령행 인수를 입력하세요");
		}		
		
	}

}

/*
  
  	★ Arguments :  명령행 인수 ▶ 프로그램 코드안에 값을 할당 또는 초기화 하지 않고
  	 						사용자가 직접 arguments 값을 부여하는 방법
  	 						
  	 						
 	★ 사용자가 직접 명령행 인수 값을 설정하는 방법
 				Run MenuBar >> Run Configurations.. >> Arguments >> Program arguments 값을 입력
  
  	★ try{~~~} catch{~~} : Exception(예외처리)블럭 ▶
 
*/