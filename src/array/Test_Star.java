package array;

import java.util.Arrays;

public class Test_Star {

	public static void main(String[] args) {
		// 가변길이 배열을 이용한 별찍기
//		★							[0][0]
//		★★						[1][0] [1][1]
//		★★★					[2][0],	[2][1], [2][2]
//		★★★★					[3][0], [3][1], [3][2], [3][3]
//		★★★★★				[4][0], [4][1], [4][2], [4][3], [4][4]
		
	
				
//		int[][] arr = new int[4][];
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = '☆';
//			}//for j
//			System.out.println();
//		}//for i
				
		int[][] star = new int[5][];				//가변길이 배열 선언 (생성)   → 5행
//		star[0] = new int[1];					//첫 번째 행의 열의 길이 선언 (1열)
//		star[1] = new int[2];					//두 번째 행의 열의 길이 선언 (2열)
//		star[2]	 = new int[3];					//세 번째 행의 열의 길이 선언 (3열)
//		star[3] = new int[4]; 					//네 번째 행의 열의 길이 선언 (4열)
//		star[4] = new int[5];					//다선 번째 행의 열의 길이 선언 (5열)
		
		//가변길이 배열 선언 → 열값
		for (int i = 0; i < star.length; i++) {
			star[i] = new int[i + 1];
//			star[i] = new int[star.length - i];
				
		}//for i
		
		//각각의 요소에 ☆ 할당
		for (int i = 0; i < star.length; i++) {
			for (int j = 0; j < star[i].length; j++) {
				star[i][j] = '☆';
				System.out.print((char)star[i][j]);
			}//for j
			System.out.println();
		}//for i
		
		
		
		
		
				
		
		
		
		
		
		
		
	}//main()
}//class
