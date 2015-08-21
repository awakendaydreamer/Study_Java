package Switch;
public class Ex_switch_case {
	public static void main(String[] args) {
/*---------------------------------선택문--------------------------------*/
		/*ㅅ
		 * 선택문(switch ~~ case ~~) : 다중 if 문을 간략하게 표현
		 * 
		 * ★swich(기준값){
		 * 	case 값1 : 
		 * 		값1이 참일때 실행되는 문장;
		 * 		break;
		 * 	case 값2 :
		 * 		값2가 참일때 실행되는 문장;
		 * 		break;
		 * 	case 값3 :
		 * 		값 3이 참일때 실해오디는 문장;
		 * 		break;
		 * 	default :
		 * 		거짓일때 실행되는 문장;
		 * 		break;
		 * }
		 * 
		 * 
		 * ※기준값은 정수형(수치형)의 자료이어야 한다.
		 * ※실행문 뒤에 반드시 break; 입력해야한다
		 * ※비교값( 값1, 값2, 값3)은 정수형(수치형)자료이어야한다, 단 jdk 1.7이상부터는 사용가능
		 * ※Java에서 유일하게 colon(:)을 사용하는 구문
		 * 
		 */
		
		int jumsu = -18;
		
		switch (jumsu/10) {
		case 10:									//100점
		case 9:										//90~99점
			System.out.println("A학점");
			break;
		case 8:										//80~89점
			System.out.println("B학점");
			break;
		case 7:										//70~79점
			System.out.println("C학점");
			break;
		case 6:										//60~69점
			System.out.println("D학점");
			break;
		case 5:										//50~59점
		case 4:										//40~49점
		case 3:										//30~39점
		case 2:										//20~29점
		case 1:										//10~19점
		case 0:										//0~9점
			System.out.println("F학점");
			break;
		default:									//입력값 오류
			System.out.println("점수를 잘못 입력하셨습니다.");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
	}//End of main()

}//End of class
