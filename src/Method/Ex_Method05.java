package Method;

import java.util.Arrays;

public class Ex_Method05 {
	//정수형 배열을 받아서(매개변수) 총합을 구하여 출력하시오.
	//단, 정수형 배열값은 arrHap() 메서드에 정의되어 있는 값을 리턴하시오.
	public static void main(String[] args) {
	//	arrHap();		//▶ 메서드 호출 : 실인수
	int[] arr = arrHap();
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			sum += arr[i];
			
		}

		System.out.println("배열 arr의 내용 : " + Arrays.toString(arr));
		System.out.println("배열 arr의 총합 : " + sum);
		
	}//main()

	
	//정수 3개가 저장된 배열(arr)을 생성하여 리턴하는 메서드(arrHap)를 정의
	public static int[] arrHap(){		//메서드 정의 : 가인수
		int[] arr = {10, 20, 30};
		return arr;
	}
}//class
