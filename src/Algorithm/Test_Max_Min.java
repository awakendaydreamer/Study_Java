package Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Test_Max_Min {

	public static void main(String[] args) {
		//배열의 크기(cnt)를 입력받은 후 배열생성(arr[])
		//arr[] 배열의 길이에 맞게 임의의 정수를 입력받아 할당
		//maxMachine() : 최대값(max)을 구하여 리턴하는 메서드를 정의
		//minMachine() : 최소값(min)을 구하여 리턴하는 메서드를 정의
		//arr[] 배열의 값을 출력, 최대값 출력, 최소값 출력
		
		Scanner sc = new Scanner(System.in); 
		System.out.print("입력할 수의 개수를 입력하세요 : ");
		int cnt = sc.nextInt();				//배열의 크기값
		int[] arr = new int[cnt];			//배열의 생성
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1 +"번째 수를 입력하세요 : ");
			arr[i] = sc.nextInt();
			if(i + 1 == arr.length){
				System.out.println("입력을 완료하였습니다.");
				System.out.println("입력하신 수는 :" + Arrays.toString(arr));
			}//if
		}//for 
		sc.close();
		System.out.println("입력하신 수의 최대값 : " + maxMachine(arr));
		System.out.println("입력하신 수의 최소값 : " + minMachine(arr));
		
	}//main()
	
	public static int maxMachine(int[] arr){
		
		
		int max = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}//if
		}//for
		
		return max;
	}//maxMachine()
	
	public static int minMachine(int[] arr) {
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}// if
		}// for
		return min;
	}// minMachine()
}// class
