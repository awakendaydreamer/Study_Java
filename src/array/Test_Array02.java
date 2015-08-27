package array;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class Test_Array02 {

	public static void main(String[] args) {
		//배열(arr)에서 홀수의 합(oddSum)과 짝수의 합(evenSum)을 각각 구하여 출력
		int[] arr = {1, 2, 3, 4, 5,5,85,1,18,9,32};  //배열을 선언하고 동시에 값을 할당 →
		int oddSum = 0, evenSum =0;
		
		//홀수의 합과 짝수의 합을 구하시 : for, if
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0 ) {							//홀수이면
				oddSum += arr[i];							//홀수의 누적합
			}else{												//홀수이면
				evenSum += arr[i];							//짝수의 누적합
			}//if 
		}//for
		
		System.out.println("처리할 값은 다음과 같습니다.");
		System.out.println(Arrays.toString(arr));		//배열 arr의 내용을 출력
		System.out.println("홀수의 합 :" + oddSum);
		System.out.println("짝수의 합 :" + evenSum);
		
		
	}//main()
}//class
