package Scanner;

import java.util.Scanner;

public class Test_scanner_gugudan {
	public static void main(String[] args) {
		//사용자로부터 출력하고 싶은 구구단의 단을 입력(danNum)받는다.	▶ Scanner
		//입력받은 단의 구구단을 출력한다.							▶ loop(for,while,do ~~ while)
		//입력받은 단의 범위는 2단부터 9단까지이며, 					▶ if ,break
		//그 외의 단이 입력되면, 오류메세지를 출력 후 재입력을 받는다.		▶ while,continue

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("출력하고 싶은 단을 입력하세요 :");
			int danNum = sc.nextInt();
			if (danNum < 2 || danNum > 9) {
				System.out.println("2 ~ 9 사이의 숫자를 입력하세요.");
				continue;
			} else {
				for (int i = 1; i <= 9; i++) {
					if (danNum * i < 10) {
						System.out.println(danNum + "X" + i + "=" + "0" + (danNum * i));
					} else {
						System.out.println(danNum + "X" + i + "=" + (danNum * i));
					}// if

				}// for i
				break;
			}// if
		}// while
		sc.close();
	}// main()
}// class
