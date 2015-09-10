package ArrayList;

import java.util.ArrayList;

import com.tjo.array.A;


public class ArrayListMain01 {

	public static void main(String[] args) {
		//3개의 크기(길이)를 갖는 정수형 배열(arr)을 선언
		int[] arr = new int[3];
		
		//배열(arr)에 10, 20, 30을 할당하시오.
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (i + 1) * 10; 
		}//for i
		
		//배열(arr)의 내용을 출력하시오.
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}//for i

		
		
		//A.class(객체) 배열을 5개 저장하시오. → com.tjo.array.package
		//A[] a = new A[5]; 	//Array 구조 : 크기(길이)가 고정
		ArrayList<Object> arrList = new ArrayList<Object>();
		arrList.add(new A());
		arrList.add(new A());
		arrList.add(new A());
		arrList.add(new A());
		arrList.add(new A());
		
		for (int i = 0; i < arrList.size(); i++) {	//size() : arrList의 길이(크기)
			((A)arrList.get(i)).print();			//get() : 출력(가져온다)
			
		}
		
	}//main()
}//class
/*
	○ Array[] : 배열
		- 순차적으로 어떤 자료(변수, 객체, 값)을 저장한다.
		- 단, 배열의 길이(크기)를 먼저 선언 해야된다.
		- 단, 자료의 타입이 동일 해야한다.
		- 중요한 메서드 : length() → 길이(크기)
		- 객체화(객체구조) 되어야 한다 ▶ new ~~~
	
	○ ArrayList<> : 무한배열
		- 순차적으로 어떤 자료(변수, 객체, 값)을 저장한다.
		- 배열의 길이(크기)를 선언하지 않아도 된다.
		- 자료의 타입이 달라도 된다. ▶ DTO(상태정보)
		- 중요한 메서드 : size() → 길이, add() → 삽입(추가), get() → 출력(가져온다),set() → 수정
		- 객체화(객체구조) 되어야 한다 → new ~~~
		- import java.util.ArrayList
		
*/