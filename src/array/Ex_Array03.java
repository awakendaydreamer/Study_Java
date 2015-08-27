package array;

import java.util.Arrays;

public class Ex_Array03 {

	public static void main(String[] args) {
		// 2행 3열의 정수형 2차원 배열(arr)을 생성하고, 각 배열의 요소에 10을 할당하시오.
		
		int[][] arr = new int[2][3];		//2행 3열의 2차원 배열 생성 (6개)
		
		
		
		
//		arr[0][0] = 10;
//		arr[0][1] = 10;
//		arr[0][2] = 10;
//		
//		arr[1][2] = 10;
//		arr[1][1] = 10;
//		arr[1][2] = 10;
		
		for (int i = 0; i < arr.length; i++) {
//								   ↑ 첫번째 [2]을 의미함
			for (int j = 0; j < arr[i].length; j++) {
//    i의 length를 찾아내야함↗   ↑두번째 [3]을 의미함	
				arr[i][j] = 10;
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
			}//for j
			System.out.println();
		}//for i
		
		
		System.out.println(Arrays.toString(arr));

	}//main
}//class
