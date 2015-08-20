package Operator;

public class Operator04 {
	public static void main(String[] args) {

		// 논리연산자 : 여러개의 조건을 종합적으로 판단 ▶ 조건문작성
		// 연산의 결과는 true, false로 변환
		// 조건A && 조건B : 조건A도 참이고 조건 B도 참일경우 → 참(true)으로 출력
		// 조건A || 조건B : 조건A 또는 조건B 중에서 어느 하나라도 참일경우 → 참(true)으로 출력
		// AND조건 : ~~이면서, ~~이고
		// OR 조건 : ~~이거나, ~~또는

		System.out.println(10 > 5 && 20 > 5);	//true(1) && true(1) = true(1)
		System.out.println(10 > 5 && 20 < 5);	//true(1) && false(0) = false(0) 
		System.out.println(10 < 5 && 20 > 5);	//false(0) && true(1) = false(0)
		System.out.println(10 < 5 && 20 < 5);	//false(0) && false(0) = false(0)
		System.out.println("--------------");
		System.out.println(10>5 || 20>5);		//true(1) || true(1) = true(1)
		System.out.println(10>5 || 20<5);		
		System.out.println(10>5 || 20<5);
		System.out.println(10>5 || 20<5);
		

	}

}
