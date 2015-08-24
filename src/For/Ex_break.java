package For;

public class Ex_break {

	public static void main(String[] args) {
		// break : 반복문을 탈출하는 명령어
		for (int i = 1; true; i++) {		//무한루프
			if( i == 10){
				System.out.println("i의 값이 10 이므로 반복문을 탈출합니다.");
				break;
				
			}//if
				
			System.out.println("i의 값 :" + i);
			
			
		}//for
	}//main()
}//class
