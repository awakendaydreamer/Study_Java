package array;

public class Ex_Array02 {
	
	public static void main(String[] args) {
		//정수 3개를 저장할 배열(arr)을 생성하고
		//동시에 모든 요소에 10을 할당(초기화) 하시오.
		
		int[] arr = {10,10,10}; //배열(arr)을 생성(선언)하고, 바로 값을 할당 → 초기화
//		↖선언  =  ↖생성&할당을 한번에   /*--new 를 뺀것이 point--*/
		
		//배열(arr)의 모든 요소의 총합(sum)을 구하여 출력하시오.
		int sum = 0;
//		arr[0] = +20;
//		sum = arr[0] + arr[1] + arr[2];
		
	for(int i = 0; i < arr.length; i++){
		sum += arr[i];					 //sum = sum + arr[i];
	}
		
		
		System.out.println("배열(arr)의 총합 : " + sum);
		System.out.println("배열(arr)의 크기 : " + arr.length);
	}//main()
}//class



/*
//배열(Array) : 객체(Class,Object)로 취급
//					→동일한 기억공간을 메모리에 연속적으로 생성하는 구조(리스트구조)
//  -같은 타입을 갖는 별수들의 집합
//  -①배열을 선언하고 공간만 확보하고, 나중에 내용물을 채우는 방식 → Ex_Array01.java
//   int[] arr = new int[3];
// 	 arr[0] = 10;
// 	-②배열을 선언하는 동시에 배열안의 내용물도 같이 할당하는 방식 → Ex_Array02.java 
// 	 int[] arr = int{10, 10, 10};
//  -배열의 요소번호(index)는 0부터 시작된다.
 	-배열명.length → 배열의 크기(길이)
 	 
*/