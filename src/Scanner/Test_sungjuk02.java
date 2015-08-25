package Scanner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test_sungjuk02 {
	public static void main(String[] args) {
		//국어(kor), 영어(eng), 수학(mat) 점수를 입력받고
		//총점(jumsu)과 평균(avg)을 구한 후
		//평균을 기준으로 학점(grade)을 출력하는 프로그램
		//국어, 영어, 수학, 총점은 int type
		//평균은 float type → 소수 첫째자리까지 표시
		//학점은 문자열 클래스 String → A학점, B학점, ~~
		//단, 각 과목의 점수 입력범위는 0 ~ 100, 그 외에는 오류메세지 출력 후 종료
		
		
		
		
		//준비단계 while if continue break
		DecimalFormat df = new DecimalFormat("0.00");
		int kor = 0, eng = 0, mat = 0;
		int jumsu = 0;
		float avg = 0;
		String grade = null;
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.print("국어점수를 1~100 사이에서 입력하세요:");
			kor = sc.nextInt();
			if(kor<= 100 && kor >=0){
				System.out.println("1부터 100까지의 수입니다.");
				
			}else {
				System.out.println("올바른 값을 입력해 주세요.");
				continue;
			}
			break;
		}	
		while(true){
			System.out.print("영어점수를 1~100 사이에서 입력하세요:");
			eng = sc.nextInt();
			if(eng<= 100 && eng >=0){
				System.out.println("1부터 100까지의 수입니다.");
				
			}else {
				System.out.println("올바른 값을 입력해 주세요.");
				continue;
			}
			break;
		}
		while(true){
			System.out.print("수학점수를 1~100 사이에서 입력하세요:");
			mat = sc.nextInt();
			if(mat<= 100 && mat >=0){
				System.out.println("1부터 100까지의 수입니다.");
				
			}else {
				System.out.println("올바른 값을 입력해 주세요.");
				continue;
			}
			break;
		}
		sc.close();
		//총점 평균계산
		jumsu = kor + eng + mat;
		avg = (float)jumsu/3;
		
		//학점 구하기
		System.out.println("총점 :" + jumsu);
		System.out.println("평균 :" + df.format(avg));
		
		if(avg >=90){
			System.out.println("A학점");
		}else if(avg >=80){
			System.out.println("B학점");
		}else if(avg >= 70){
			System.out.println("C학점");
		}else if(avg >= 60){
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
		
		
		
		
		
		
//		System.out.println("");
		
		
		//국어점수 입력(0부터 100사이의 값만 입력 → 재입력) : while, if, continue, break
		
		//수학점수 입력(0부터 100사이의 값만 입력 → 재입력) : while, if, continue, break
		
		//영어점수 입력(0부터 100사이의 값만 입력 → 재입력) : while, if, continue, break
	
		//총점, 평균 계산
		
		//학점구하기

		//과목점수, 총점, 평균, 학점 출력
	}//main()
}//class
