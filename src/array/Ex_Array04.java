package array;

public class Ex_Array04 {

	public static void main(String[] args) {
		// 3차원 배열(arr)을 생성하고 각각의 요소에 10을 할당.

		int[][][] arr = new int[2][3][4];           //면, 행, 열
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					arr[i][j][k] = 10;			//arr[0][0][0] = 10, arr[0][0][1] = 10, ~~~, arr[1][2][3] = 10;
					System.out.print("arr[" + i + "][" + j + "][" + k + "] = " + arr[i][j][k] + "\t");
					
					
				}//for k
				System.out.println();
			}//for j
			System.out.println();
		}//for i
		
		
//		arr[0][0][0] = 10;
//		arr[0][0][1] = 10;
//		arr[1][2][3] = 10;
//		
//		int[][][] arr = {      {    {     }  }   };

		
		
		
		
		
	}//main()
}//class
