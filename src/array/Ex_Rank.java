package array;

public class Ex_Rank {

	public static void main(String[] args) {
		// 순위(Rank) 구하기 : 순위가 저장될 배열을 생성하고, 원소값은 무조건 1로 할당
		//1등으로 순위가 부여되고, 반복문에 의해서 큰 수를 만나면 +1로 처리 (순위가 밀린다)
	
		
		//준비단계
		int[] arr = {40, 30, 10, 20, 50, 30};	//점수가 입력된 배열
		int[] rank = new int[arr.length];	//순위가 저장될 배열
		
		//
		for (int i = 0; i < arr.length; i++) {
			int r = 1;							//1등으로 시작
			
			for (int j = 0; j < rank.length; j++) {
				if(arr[i] < arr[j]){					//내림차순 순위를 구한다(큰수가 1등)
					r += 1;						//순위가 뒤로 밀린다.
				}//if
			}//for j
			
			rank[i] = r;
			
		}//for i
		System.out.println("점수" + "\t" + "순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t" + rank[i]);
		}//for i2
		
/*=============================================*/	
		for (int i = 0; i < arr.length; i++) {
			int r = 1;							//1등으로 시작
			
			for (int j = 0; j < rank.length; j++) {
				if(arr[i] > arr[j]){					//오름차순 순위를 구한다(작은수가 1등)
					r += 1;						//순위가 뒤로 밀린다.
				}//if
			}//for j
			rank[i] = r;
		}//for i
		System.out.println("점수" + "\t" + "순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "\t" + rank[i]);
		}//for i2		
		
		
	}//main()
}//class
