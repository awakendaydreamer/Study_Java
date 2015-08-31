package Method;

public class Ex_Method03 {

	public static void main(String[] args) {
		//매개변수로 정수형 배열(arr)을 받아서 총합(sum)을 구하여 출력하는 메서드(arrHap)를 호출
//		int[] arr =new int[3];
		int[] arr = {10,20,30};
		arrHap(arr);	//arrHap 메서드를 호출 ▶ 실인수 : arr(배열)
		
		
	}//main()

	//매개변수로 전달받은 정수형 배열(arr)을 이용하여 총합(sum)을 구하는 메서드를 정의(생성)
	public static void arrHap(int[] arr) {	//▶ 가인수 : int[] arr  ←int[] 앞에 써줘야함!!
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum+ arr[i];					//sum += arr[i];
			
		}
		System.out.println("배열 arr의 총합 :" + sum);
	}//arrHap()
}//class
