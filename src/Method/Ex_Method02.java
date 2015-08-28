package Method;

public class Ex_Method02 {
	//hap 이라는 메서드에 두 개의 실수(a,b)를 전달하여 합을 구하는 호출문을 작성
	//단, return 하시오.(hap method 결과 값 → main method 전달) 
	
	public static void main(String[] args) {
		float a = 34.56F;																//1
		float b = 56.78F;																//2
		float result = hap(a, b); 		//hap 메서드를 호출 ▶ 실인수			//4
		System.out.println("첫 번째 인수 : " + a);									//7
		System.out.println("두 번째 인수 : " + b);									//8
		System.out.println("두 인수의 합 : " +result);								//9
	}//main()
	
	public static float hap(float x, float y){		//가인수						//3
		float sum = x + y;																//5
		return sum;										//return : void → return type 변경 //6
	}//hap()
	
}//class
