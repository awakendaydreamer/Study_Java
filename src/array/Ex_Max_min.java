package array;

public class Ex_Max_min {

	public static void main(String[] args) {
/*==========최대값 구하기=========*/	 
		int[] arr = {40, 30, 10, 20, 50};
		int max = arr[0];							//최대값이 저장될 변수 max에 배열의 첫 번째 원소값을 할당.
		
		
		//최대값
			for (int i = 0; i < arr.length; i++) {
				if(arr[i] > max){
					max = arr[i];
				}//if
		
			}//for
			System.out.println("최대값 : " + max);
			
		//최소값	
		int min = max + 1;								//int min = 999; (999가 1000?이 되면?.... 이해안됨)
			
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}//if
		}//for
			System.out.println("최소값 : " + min);
			
	}//main()
}//class
