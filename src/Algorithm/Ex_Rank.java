package Algorithm;

import java.util.Scanner;

public class Ex_Rank {

	public static void main(String[] args) {
		
		//part[] 배열의 크기에 맞게 점수를 입력받아 할당(jumsu[])
		//ranking():순위(rank[])를 구하여 리턴하는 메서드를 정의
		//jumsu[] 배열(점수)의 값을 출력, rank[] 배열(순위)의 값을 출력
		
		Scanner sc = new Scanner(System.in);
		String[] part = {"국어", "영어", "수학", "사회" , "과학"};	//과목 배열 초기화
		int[] jumsu = new int[part.length];	//점수를 저장할 배열 생성

		for (int i = 0; i < part.length; i++) {
			System.out.print(part[i] + "점수를 입력하세요 : ");
			jumsu[i] = sc.nextInt();	//입력받은 점수를 배열에 할당
			if (i + 1 == part.length) { //배열의 마지막 원소값이 입력되면
				System.out.println("입력이 완료 되었습니다.");
			}
		}
		sc.close();
		int[] rank = new int[part.length];	//순위가 저장될 배열 생성
		ranking(jumsu,rank);	//순위를 구하는 메서드 호출
		System.out.println("--------------------");
		System.out.println("과목\t점수\t순위");
		System.out.println("--------------------");
		for (int i = 0; i < part.length; i++) {
			System.out.println(part[i]+"\t" + jumsu[i]+"\t" + rank[i]);
		}
		System.out.println("--------------------");
	}//main()
	
	//순위를 구하는 메서드 정의
	public static void ranking(int[] jumsu,int[] rank){
		for (int i = 0; i < rank.length; i++) {
			int r = 1;	//1등으로 시작
			for (int j = 0; j < rank.length; j++) {
				if (jumsu[i] < jumsu[j]) {
					r++;	//순위가 뒤로 밀린다.
				}//if
			}//for j
			
			rank[i] = r;
		}//for i
	}//ranking()
	
	
}//class
