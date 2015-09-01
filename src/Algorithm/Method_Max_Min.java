package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Method_Max_Min {

	public static void main(String[] args) {
		//Method_Max_Min 객체를 생성 ④
		//input(), maxMachine(), minMachine() 호출
		Method_Max_Min mmm = new Method_Max_Min();
		
		int[] arr = mmm.input();
		System.out.println("입력하신 수의 최대값 : " + mmm.maxMachine(arr));
		System.out.println("입력하신 수의 최소값 : " + mmm.minMachine(arr));
	}//main()
	
	
	//배열의 크기를 입력받고, 크기만큼 정수를 입력받는다.①
	public int[] input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("입력할 수의 개수를 입력하세요 : ");
		int cnt = sc.nextInt();
		int[] arr = new int[cnt];
	
	for (int i = 0; i < arr.length; i++) {
		System.out.println(i + 1 + "번째 수를 입력하세요 :");
		arr[i] = sc.nextInt();
		if(i + 1 == arr.length){
			System.out.println("입력을 완료하였습니다.");
			System.out.println("입력하신 수는 : " + Arrays.toString(arr));
		}//if
	}//for	
	sc.close();
	
	return arr;

	
	}//input()
	
	//최대값 구하는 메서드 정의 ②
	public int maxMachine(int[] arr) {
		int max = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}// if
		}// for

		return max;
	}

	// 최소값 구하는 메서드 정의 ③
	public int minMachine(int[] arr) {
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}// if
		}// for
		return min;
	}
}//class
