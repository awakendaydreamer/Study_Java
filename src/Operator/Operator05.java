package Operator;
public class Operator05 {
	public static void main(String[] args) {
			//비교연산자 ▶ 조건식 작성에 사용
			// 연산의 결과는 true, false로 변환
			//>(grater than) , >= , <(less than), <= : 수학의 연산과 같은 부등호 연산(관계연산)
			//a = b : 수학에서는 같다라는 의미지만, 프로그램에서는 할당 연산자
			//a == b : a와 b는 같다.
			//a != b : a와 b는 같지않다

	int a = 10, b = 5;
	System.out.println(a == b);	//false	
	System.out.println(a != b);	//true
	System.out.println(a > b);	//true
	System.out.println(a >= b); //false
	
	System.out.println(a > 10); //false
	System.out.println(a >= 10);//true
	}

}
