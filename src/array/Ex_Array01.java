package array;

public class Ex_Array01 {

	public static void main(String[] args) {
		// 정수 3개를 저장할 배열(arr)을 생성하고, 모든 요소에 10을 할당(초기화)하시오.
		
		int[]arr = new int[3]; //정수 3개를 저장할 배열(arr)을 생성(선언)
//		↖선언  = ↖생성
//		int arr[] = new int[3];
//		 ↓할당		
		arr[0] = 10; //배열(arr)의 0번지(index)에 10을 할당
		arr[1] = 10; //배열(arr)의 1번지(index)에 10을 할당
		arr[2] = 10; //배열(arr)의 2번지(index)에 10을 할당
		
	
		System.out.println("array[0]의 값 :" + arr[0]); //배열(arr)의 0번지 값을 출력
		System.out.println("array[1]의 값 :" + arr[1]); //배열(arr)의 1번지 값을 출력
		System.out.println("array[2]의 값 :" + arr[2]); //배열(arr)의 2번지 값을 출력
	
		
		System.out.println(arr); //배열(arr)이 참조하는 해쉬코드 값을 출력(16진법)
//[I@659e0bfd @는 주소를 나타냄
		
		
	}//main()
}//class
