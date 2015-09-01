package Algorithm;

public class Test_Mode {

	public static void main(String[] args) {
		//A ~ F의 6개의 문자가 저장된 배열(alpa)에서 각 문자의 빈도수를 구하여 출력
		
		char[] alpa = {'A','B','F','C','D','A','E','F','B','A','E'};//영문자가 저장된 배열
		//a65 b66 c67 d68 e69 f70 
		int[] cnt = new int[5]; 	//빈도수가 저장될 배열 생성
		
		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < alpa.length; j++) {
				if (i == alpa[j] - 65) {
					cnt[i]++;
				}//if
			}//for j
		}//for i
		
		
		for (int i = 0; i < cnt.length; i++) {
			System.out.print((char)(i+65) + "의 출현 회수 :" + cnt[i] + "회");
			for (int j = 0; j < cnt[i]; j++) {
				System.out.print("■");
			}//for j
			System.out.println();
		}
		
	}//main()
}//class
