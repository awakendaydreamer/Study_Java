package OOP3;

import java.util.Arrays;

public class Test_Arguments {

	public static void main(String[] args) {
		//명령행 인수로 임의의 정수 여러(배열이용)개를 입력받고 출력하시오.
		//명령행 인수로 입력받은 값을 내림차순 정렬하여 출력하시오.
		//Run MenuBar >> Run Configurations.. >> Arguments >> Program arguments 값을 입력
		//입력 예 : 10 30 50 40 60 20 70 100 80 90
		//정수형 배열 (arr) 선언 (생성) : 배열의 크기(길이)

		int[] arr = new int[args.length];		//★★★★  arg.length를 이용해서 배열의 크기를 유동적으로 바꾼다
		
		
		//Wrapper Class를 이용하여 배열 arr의 각 번지(index)에 값을 할당
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(args[i]);
		}//for i

		//출력(Arrays.toString 이용)
		System.out.println("정렬 전 : " + Arrays.toString(arr));
		
		//내림차순으로 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] < arr[j]){ 	//내림차순
					 int temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				}//if
			}//for j
		}//for i
		
		
		//출력(Arrays.toString 이용)
		System.out.println("정렬 후 : " + Arrays.toString(arr));
		
		
		
		for (int i = 0; i < arr.length; i++) {
			if (i == 0) {
				System.out.print("정렬 후 : " + "[" + arr[i] + ",");
			}else if(i <= arr.length - 1){
				System.out.print(arr[i] + "," + "\t");
			}else if(i == arr.length - 1){
				System.out.print(arr[i] + "]");
			}
		}
		
		
		
		
	}//main()
}//class
