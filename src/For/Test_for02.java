package For;
public class Test_for02 {
	public static void main(String[] args) {
		//1부터 100까지의 수 중에서 짝수의 합(sum)을 구하여 출력하시오 : for, if
		
		
//		for (int i = 1; i<=100; i++){  //1부터 100까지 1씩 증가시켜라 (반복)
//			if(i % 2 == 0){				//짝수이면	
//				 sum = sum + i;          //누적합을 계산(sum +=i;)
//			
//			}//End of if
//		}//End of for

	//1부터 100까지의 수 중에서 짝수의 갯수(cnt)는 몇 개인가? : for, if
		
		int cnt = 0;
		
		for (int i = 1; i<=100; i++){
			if (i % 2 == 0){
				cnt = cnt + 1;
			//② cnt += 1;
			//③	cnt++	
				System.out.println(i);
			}//End of if
		}//End of for
		System.out.println("짝수의 개수:" + cnt);
		
	}//End of 

}
