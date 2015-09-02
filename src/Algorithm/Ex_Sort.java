package Algorithm;

import java.util.Arrays;

public class Ex_Sort {

	public static void main(String[] args) {
		//임의의 정수를 입력받아 배열(arr)에 저장하고 ▶Method_Max_Min.java input()호출
		//배열에 저장된 수를 오름차순(ascSort()), 내림차순(decSort())으로 정렬하는 메서드 정의
		Method_Max_Min mmm = new Method_Max_Min();
		int[] arr = mmm.input();	//input()호출
		System.out.println("오름차순 정렬 : " + Arrays.toString(arr));
		System.out.println("내림차순 정렬 : " + Arrays.toString(arr));
		
	
	}//main()
	
	//오름차순 정렬하는 메서드 정의
	public static int[] ascSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}//ascSort()
	
	
	
	
	//내림차순 정렬하는 메서드 정의
	public static int[] decSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}//decSort()
}
