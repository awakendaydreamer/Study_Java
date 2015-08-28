package Method;

public class Ex_Method01 {

	public static void main(String[] args) {
			//hap 이라는 메서드에 10과 20을 매개변수로 보내는 호출문을 작성
			int a = 10, b = 20;		//hap 이라는 메서드로 보낼 매개변수(인수)를 초기화
			hap(a,b);					//hap 이라는 메서드를 호출문 ▶ 실인수

	
	}//main()
	
	//2개의 정수를 매개변수(인수)로 받아서 합(sum)을 구하여 출력하는 메서드(hap)를 정의
	public static void hap(int a, int b){		//인수(Parameter, 매개변수) ▶ 가인수
		int sum = a + b;
		System.out.println("첫 번째 인수 : " + a);
		System.out.println("두 번째 인수 : " + b);
		System.out.println("두 인수의 합 : " + sum);
	}
	
	
}//class
/*
 * ★ Method(메서드 : 방법) : 객체가 가지고 있는 행위정보를 표현하는 것(동작, 기능) → 함수(Function)
 * 		- 행위(동작)를 만들어 놓고 필요할 때 사용하기 위해서 호출(calling)
 * 		- 자바는 클래스 단위로 프로그램을 만든다. ▶ 하나의 클래스에는 여러개의 메서드 존재
 * 
 * 
 * 		※ 클래스 (객체) 안에는 무엇이 들어가는가?
 * 			- 상태정보 : 멤버변수 ▶ DTO
 * 			- 행위정보 : 멤버 메서드 ▶ DAO
 * 
 * ★ 메서드의 형식(메서드를 만드는 방법)
  ①        ②    ③   ④(     ⑤      )
 public static void hap(int a, int b)					▶ header 머리: 프로토타입
 { ~~ 메서드의 동작 구현 ~~ ⑥return; } 			▶ body   바디: 구현부, 범위(scope), 지역(local)
 
 ① 접근 제어자 : public(접근허용) private(정보은닉: 내부(같은 클래스에서)만 허용), protected(같은 패키지), default(같은 프로젝트)
 ② 한정자 : static(자동으로 메모리에 생성), final(용도변경X, 재정의X)
 ③ 리턴타입(반환값) : 메서드가 동작 후에 최종적으로 만들어내는 결과값의 데이터 타입(★)
 		- 리턴을 하지 않는 경우 : void → 메서드 내부에 return 문이 없다. (Data Type이 없다)
 		- 리턴을 하는 경우 : 리턴되는 데이터 타입을 기록 → 메서드 내부에 return문이 있다.
 ④ 메서드 이름  : 소문자로 작성, 키워드(예약어)는 사용 불가, 의미있게 작성
 ⑤ 매개변수 리스트 : 메서드가 동작하기 위해서 외부로부터 입력되는 데이터(인수, 인자, 매개변수, 파라미터)
 ⑥ return 문 : 메서드가 동작이 끝났다라는 신호, 호출한쪽으로 결과값을 넘기는 행위
 
  ★ 호출하는 쪽 (실인수), 호출당하는 쪽 (가인수)의 매개변수 전달규칙(Parameter Passing Rule)
  		- 실인수와 가인수의 매개변수 개수가 같아야 한다.
  		- 실인수와 가인수의 매개변수 데이터 타입이 같아야 한다.
  		- 실인수의 이름과 가인수의 이름은 같아도 되고, 달라도 된다.
  
  
  
 
  
 * 
 *
 *
 *
 * 
 *  */
