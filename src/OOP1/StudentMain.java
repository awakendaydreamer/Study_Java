package OOP1;

public class StudentMain {

	public static void main(String[] args) {
		//Student Class 객체를 생성하고 값을 입력(멤버변수)
		//총점, 평균, 출력(멤버메서드) 호출
		Student s1 = new Student();	//s1객체 생성
		s1.name = "유재석";
		s1.kor = 70;
		s1.eng = 80;
		s1.mat = 90;
		s1.sum();
		s1.avg();
		s1.print();
		
		
		Student s2 = new Student();
		s2.name = "박명수";
		s2.kor = 60;
		s2.eng = 50;
		s2.mat = 100;
		s2.sum();
		s2.avg();
		s2.print();
		
		Student s3 = new Student();
		s3.name = "정형돈";
		s3.kor = 60;
		s3.eng = 90;
		s3.mat = 50;
		s3.sum();
		s3.avg();
		s3.print();
		
		
	}//main()
}//class
