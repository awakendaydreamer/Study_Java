package Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;



public class Test_sungjuk01 {
	public static void main(String[] args) {
		//국어(kor), 영어(eng), 수학(mat) 점수를 입력받고
		//총점(jumsu)과 평균(avg)을 구한 후
		//평균을 기준으로 학점(grade)을 출력하는 프로그램
		//국어, 영어, 수학, 총점은 int type
		//평균은 float type → 소수 첫째자리까지 표시
		//학점은 문자열 클래스 String → A학점, B학점, ~~
		//단, 각 과목의 점수 입력범위는 0 ~ 100, 그 외에는 오류메세지 출력 후 종료
		
		
		int kor = 0, eng = 0, mat = 0, jumsu = 0; 
//		float avg;
		String grade; 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 :");
		kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요 :");
		eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력하세요 :");
		mat = sc.nextInt();
		
		sc.close();
		
		jumsu = kor + eng + mat ;						//총점
		float avg = (float)jumsu / 3;					//평균
		DecimalFormat df = new DecimalFormat("0.0"); 	//소수 첫째자리까지 표시
		grade = null;									//학점을 저장할 변수를 선언하고 null값을 할당 ▶ 초기화
		
		if (!(kor >= 0 && kor <= 100) || !(eng >=0 && eng <= 100 ) || !(mat >= 0 && mat <= 100)){
		
			System.out.println("입력범위를 벗어났습니다");
			return;
		}else {
			if(avg >= 90){
				grade = "A학점";
			}else if(avg >= 80){
				grade = "B학점";
			}else if(avg >= 70){
				grade = "C학점";
			}else if(avg >= 60){
				grade = "D학점";
			}else {
				grade = "F학점";
			}
			
			}//if
			
		
		
		System.out.println("국어점수 :" + kor);
		System.out.println("영어점수 :" + eng);
		System.out.println("수학점수 :" + mat);
		System.out.println("총점 :" + jumsu);
		System.out.println("평균 :" + avg);
		System.out.println("학점 :" + grade);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main()
}//class
