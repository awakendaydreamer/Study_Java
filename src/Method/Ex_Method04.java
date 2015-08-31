package Method;

import java.util.Arrays;

public class Ex_Method04 {
//매개변수로 정수형 배열(arr)을 받아서 총합(sum)을 구하여
//리턴하는 메서드(arrHap)를 호출하고 총합을 출력
	public static void main(String[] args) {
		int[] arr = {10, 20, 30};
		int result = arrHap(arr);
		System.out.println("배열 arr의 내용 : " + Arrays.toString(arr));
		System.out.println("배열 arr의 총합 : " + result);
		System.out.println("배열 arr의 총합 : " + arrHap(arr));
	}//main()

	private static int arrHap(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i	];
		}
		return sum;
	}//arrHap()

	
}//class

	