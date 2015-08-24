package For;

public class Test_break {

	public static void main(String[] args) {

		//1부터 100까지의 총합(sum)을 구하시오 : for
		//단, 총합이 1024 이상이면 반복을 중지하고, 그때까지의 누적값을 출력 : if, break
		
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
			if(sum >= 1024){
				break;
			}//if
		}//for
		System.out.println("누적값:" + sum);
		System.out.println("i의 값:" + i);
		
		
		
		
		
		
	}//main()
}//class
