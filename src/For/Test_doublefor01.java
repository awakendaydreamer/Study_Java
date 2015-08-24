package For;

public class Test_doublefor01 {
	public static void main(String[] args) {

		// 별찍기.
		

		for (int i = 5; i <= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}//for i
			System.out.println();
		}//for j
		 System.out.println("실패했습니다.");
	}//main()
}//class
