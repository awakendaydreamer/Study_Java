package OOP1;

import java.text.DecimalFormat;

public class Student {
	//멤버변수 선언
	String name;
	int kor, eng, mat, sum;
	float avg;
	
	//총점 멤버메서드 정의
	void sum(){
		sum = kor + eng + mat;
		
	}//sum()
	
	//평균 멤버메서드 정의
	void avg(){
		avg = (float)sum / 3;
		
	}//avg()

	
	//출력 멤버메서드 정의
	void print(){
		DecimalFormat df = new DecimalFormat("0.0");
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + mat);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + df.format(avg));
	}//print()
}//class
