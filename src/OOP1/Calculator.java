package OOP1;

public class Calculator {

	public static void main(String[] args) {
		//아래의 조건에 맞게 계산기 클래스를 작성한다. 두 개의 숫자(정수)를 덧셈과 뺄셈을 하여 화면에 출력한다.
		
		//조건
		//클레스의 이름은 Calculator로 한다.
		//두 개의 숫자(정수)는 main 메서드의 인자로 입력받는다.
		//멤버 변수 x,y를 선언한다.
		//생성자 메서드에서 멤버변수 x,y에 입력받은 값을 대입한다.
		//덧셈을 계산하는 sum() 메서드를 작성한다.
		//뺄셈을 계산하는 subtract() 메서드를 작성한다.
		
		
		
		//실행결과
		//-java Calculator 10 20
		//ADD : 10 + 20 = 30
		//SUB : 10 - 20 = -10
		
		//-java calculator 500 55
		//ADD : 500 + 55 = 555

	int x;
	int y;
//	int sum = Sum(x, y);
//	int subtract = Subtract(x,y);
//	System.out.println("ADD : " + x +"+" + y + "=" + sum);
//	System.out.println("SUB : " + x +"-" + y + "=" + subtract);
	
	
	
	
	
	}

	private static int Sum(int x, int y) {
		int sum = 0;
		sum = x + y;
		
		return sum;
		
	}

	private static int Subtract(int x, int y) {
		int subtract = 0;
		subtract = x - y;
		
		return subtract;
	}
	
	

}
