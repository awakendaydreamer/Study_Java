package array;

import java.util.Arrays;

public class Ex_Sort {

	public static void main(String[] args) {
		// Sort(정렬) : 무작위의 데이터를 일정 기준(오름차순, 내림차순)으로 재배치하는 것
		//오름차순(ascending) : {1,2,3 ~~}, {A, B ,C}
		//내림차순(descending) : 오름차순의 역수

		int[] arr = {40, 30, 10, 20, 50}	;
		System.out.println("오름차순 정렬 전 : " + Arrays.toString(arr));
		Arrays.sort(arr);				//오름차순
		System.out.println("오름차순 정렬 후 : " + Arrays.toString(arr));
	
		int[] arr2 = new int[arr.length];
		int index = arr.length -1;
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[index--];
		}
		System.out.println("내림차순 정렬 후 : " + Arrays.toString(arr2));
		
		//선택정렬 알고리즘(오름차순)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]){ 	//오름차순
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				}//if
			}//for j
		}//for i
		System.out.println("오름차순 정렬 후 : " + Arrays.toString(arr));
		
		//선택정렬 알고리즘 (내림차순)
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]){ 	//내림차순
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				}//if
			}//for j
		}//for i
		System.out.println("내림차순 정렬 후 : " + Arrays.toString(arr));
		
		
	}//main()
}//class
