package OOP3;

public class Ex_Argument02 {

	public static void main(String[] args) {
		//명령행 인수 200 (args[0]),  100 args[1]을 부여하고 사칙연산을 실행한다.
		//Run MenuBar >> Run Configurations.. >> Arguments >> Program arguments 값을 입력
		
		
		
		try {
			int su1 = Integer.parseInt(args[0]);	//문자 200 → 정수 200으로 변환 ▶ Wrapper Class
			int su2 = Integer.parseInt(args[1]);	//문자 100 → 정수 100으로 변환 ▶ Wrapper Class
			System.out.println("덧셈" + (su1 + su2));
			System.out.println("뺄셈" + (su1 - su2));
			System.out.println("곱셈" + (su1 * su2));
			System.out.println("나눗셈" + (su1 / su2));
		
			//String → int : Boxing(정수 Wrapper Class)
			//int → String : UnBoxing(문자) ▶ String.valueOf(su1);
			System.out.println("Boxing(정수) : " + su1);
			System.out.println("UnBoxing(문자) :" + String.valueOf(su1));
			
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("명령행 인수를 입력하세요");
		}
		
		
		
	}//main()
}//class
