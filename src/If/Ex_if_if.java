package If;

public class Ex_if_if {
	public static void main(String[] args) {
/*-------------------------중첩 if-----------------------------------------------*/
	/*
	 * ★중첩 if 문 : if문 안에 다른 if문이 있는 문장
	 * 
	 * if(조건식B){
	 * 	if(조건식1){
	 * 		조건B를 만족한 상태에서 조건1이 참일때 실행되는 문장;
	 * 	 }else if(조건식2){
	 * 		조건B를 만족한 상태에서 조건이2가 참일때 실행되는 문장;
	 * 	 }else if(조건식3){
	 * 		조건B를 만족한 상태에서 조건3이 참일때 실행되는 문장; 
	 * 	}else{
	 * 		조건 B를 만족한 상태에서 거짓일때 실행되는 문장;
	 * }
	 */

		int jumsu = -7;

		if (jumsu >= 0 && jumsu <= 100) {
			if (jumsu >= 90) {
				System.out.println("A학점");
			} else if (jumsu >= 80) {
				System.out.println("B학점");
			} else {
				System.out.println("점수를 잘못 입력하셨습니다.");
			}
		} else {
			System.out.println("0~100 수치가 범위를 벗어났습니다.");
		}// End of if

	}// End of main()
}// End of class
