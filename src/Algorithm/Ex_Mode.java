package Algorithm;

public class Ex_Mode {

	public static void main(String[] args) {
		// 최빈값(Mode) : 데이터가 저장된 배열에서 가장 많이 출현되는 수
		// 정수형 배열 (arr)에서 1부터 5까지의 수가 몇번씩 나오는지 출력
		int[] arr = { 1, 5, 1, 3, 4, 4, 5, 1, 3, 4, 3, 1, 4, 5, 2, 3, 4, 2,
				2,  2 };
		int[] cnt = new int[5]; // 출현되는 횟수를 저장할 배열(cnt[])생성

		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i + 1 == arr[j]) {
					cnt[i]++;
				}// if
			}// for j

		}// for i

		for (int i = 0; i < cnt.length; i++) {
			System.out.print(i + 1 + "의 출현 회수 :" + cnt[i]);
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print("■");
			}//for j
			System.out.println();
		}//for i
		
		
	}// main()
}// class
