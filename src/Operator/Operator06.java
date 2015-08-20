package Operator;
public class Operator06 {
	public static void main(String[] args) {
		//할당연산자(=) : =(equal)은 같다(==)라는 의미가 아닌 할당한다를 의미 → 대입연산자
		// L - Value = R - Value : R-Value의 값(연산결과)을 L-Value로 대입(할당)
		
		int a = 10; //선언,할당 → 초기화
		System.out.println("a의 값 : " + a);
		
		int b = a; 	//선언, 할당 → 초기화
		System.out.println("b의 값 : "+ b);
		
		b = a + a;  //재할당	
		System.out.println("b의 값 : " + b);
		
		a = a + a;  //재할당
		System.out.println("a의 값 : " + a);
		
		a = a + a;
		System.out.println(a);

		
		/*복합대입연산자(★)*/
		
		a += a; //a = a + a;
		System.out.println("a의 값 : " + a);
		
		b =+ b;	//b = b + b;
		System.out.println("b의 값 : " + b);
		
		
		int x = 10;
		x = x + 100;
		
		System.out.println("x의 값 : " + x);
		
		
		int y = 10;
		y += 100;
		System.out.println("y의 값 : " + y);
		
		
		
		
		
	} //End of main()

} //End of Class
