package For;

public class Test_for01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1부터 10까지의 총합(sum)을 구하시오.
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println("i 값 : " + i + ", sum값 :" + sum);
		}// End of for
		System.out.println("총합 :" + sum);

	}// End of main()

}// End of class
