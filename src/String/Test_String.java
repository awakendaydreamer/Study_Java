package String;

import java.util.Arrays;

public class Test_String {

	public static void main(String[] args) {
		String str = "사과@바나나@딸기@오렌지@메론@레몬@블루베리@수박";
		//@ 기준으로 문자열을 분리하고 출력
		String[] arr = str.split("@");
		
//		System.out.println(Arrays.toString(arr));

		print(arr);
		//과일 이름을 기준으로 내림차순 정렬(decSort()) 후 출력(print())
		descSort(arr);
		print(arr);
	}//main()

	public static void print(String[] arr){
		System.out.println(Arrays.toString(arr));
	}
	
	public static void descSort(String[] arr){
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].compareTo(arr[j]) <0 ) {
					String	temp = arr[i];
					arr[i] = arr[j];
					arr[j]= temp;
				}
			}
		}
	}
}
