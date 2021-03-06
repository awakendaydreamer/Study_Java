package Algorithm;

public class Ex_Max {

	public static void main(String[] args) {
		//정수형 배열(arr)의 원소값의 최대값(max)을 구하여 출력
		int[] arr = { 4, 3, 1, 2, 5 };// 정수형 배열 arr을 선언(생성)하고 값을 할당 → 초기화
		int max = arr[0]; // max 변수 초기화
		
		for (int i = 0; i < arr.length; i++) {
			if(max < arr[i]){//현재의 최대값(max)과 각각의 배열 원소값을 배교
				max = arr[i];//배열 원소값(arr[i])이 크면, 최대값을 변경(재할당)
			}//if
		}//for i
		System.out.println("배열의 최대값 : " + max);
	}//main()
}//class
