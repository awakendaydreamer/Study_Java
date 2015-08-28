package array;

import java.util.Arrays;

public class Ex_Swap_Array {

	public static void main(String[] args) {
		// 배열에 저장된 데이터를 출력
		int[] arr1	= {1, 2, 3, 4, 5 };
		System.out.println("arr1 배열의 값 : " + Arrays.toString(arr1)); //출력방법 ①
		System.out.print("arr1 배열의 값 : ");								 //출력방법 ②
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");	
		}
		
		
		//배열에 저장된 데이터를 역순으로 출력①
		int[] arr2 = new int[arr1.length];
		arr2[0] = arr1[arr1.length - 1];	//arr1[4];
		arr2[1] = 	arr1[arr1.length - 2];	//arr1[3];
		arr2[2] = 	arr1[arr1.length - 3];	//arr1[2];
		arr2[3] = 	arr1[arr1.length - 4];	//arr1[1];
		arr2[4] = arr1[arr1.length - 5];	//arr1[0];
		System.out.println("\n arr2  배열의 값 : " + Arrays.toString(arr2));
		
		//역순으로 출력 ②
		int[] arr3 = new int[arr1.length];
		int index = arr1.length - 1;									//index : 4
		for (int i = 0; i < arr1.length; i++) {
			arr3[i] = arr1[index--];
		}
		System.out.println("arr3 배열의 값 : " + Arrays.toString(arr3));
		
	}//main()
}//class
