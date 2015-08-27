package array;

public class Ex_Array05 {

	public static void main(String[] args) {
		// 가변길이 배열(행은 고정, 열이 가변길이) → 자바는 행단위 우선할당 방식(Row-Major)
		int[][] arr =new int[2][];
		
		arr[0] = new int[2];		 //[0][0] , [0][1]
		arr[1] = new int[3];		 //[1][0] , [1][1], [1][2]
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = 10;
				System.out.print("arr[" + i + "][" + j + "] = " + arr[i][j] + "\t");
			}//for j
			System.out.println();
		}//for i
	
	
	
	
	}//main()
}//class
