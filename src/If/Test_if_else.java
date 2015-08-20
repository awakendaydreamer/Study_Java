package If;
public class Test_if_else {
	public static void main(String[] args) {
		
/* --------------------------------------블럭 if ----------------------*/
		//성별코드(code)값이 1 또는 3이면 '남자',그외에는 '여자'
		
		int code = 3;
		if((code == 1) || (code == 3)){		//code==1||code==3이라고 써야 맞는것
			System.out.println("남자입니다.");
		} else{
			System.out.println("여자입니다.");
		}//End of if

	
	}//End of main()
}//End of class
