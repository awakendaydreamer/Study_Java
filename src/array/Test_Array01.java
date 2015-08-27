package array;

public class Test_Array01 {

	public static void main(String[] args) {
		//정수 3개를 저장하고 배열(arr)을 생성하고, 모든 요소에 10을 할당하시오.
		int[] arr = new int[3];						//정수 3개를 저장할 배열(arr)을 생성(선언)
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = 10; 								//배열 arr[i] 번지에 10을 할당
			System.out.println("arr[" + i + "]의 값 :" + arr[i]); //배열 arr[i]
		}//for i
		
		int[] arr1 = {10, 10, 10};
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "]의 값 :" + arr[i]);
		}
		
		
	}//main()
}//class
