package Algorithm;

import java.util.Arrays;

public class Ex_Sum {

	public static void main(String[] args) {
		//정수형 배열(arr)의 원소값의 누적합(sum)을 구하여 출력
		
		int[] arr = { 4, 3, 1, 2, 5 };	//정수형 배열 arr을 선언(생성)하고 값을 할당 → 초기화
		int sum = 0; 	//누적합이 저장될 정수형 변수 sum을 선언하고 초기화
		
		for (int i = 0; i < arr.length; i++) {
			sum =sum + arr[i]; 	//누적합을 계산
		}
		System.out.println("배열의 값 : " + Arrays.toString(arr));
		System.out.println("배열의 누적합 : " + sum);
	}//main()
}//class
