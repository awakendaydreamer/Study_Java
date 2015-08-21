package For;
public class Ex_for04 {
	public static void main(String[] args) {
		// 1부터 100까지의 수 중에서 3의 배수와 개수(cnt)를 출력하시오. :for(반복),if(3의배수)
		
		int cnt = 0;
		System.out.println("3의 배수:");
		for (int i = 1; i<=100 ; i++){						//1부터 100까지 1씩 증가(반복)
			if (i%3 == 0){									//3의 배수이면
				if(i<10){									//한 자리수이면
					System.out.println("0"+ i + " ");		//숫자앞에 0을 붙여서 두 자리로 출력하고
				}
				System.out.print(i + " ");
				cnt++;
				if(cnt % 10 == 0){
					System.out.println();
				}
			} 
		}
		System.out.println();
		System.out.println("3의 배수의 개수 :" + cnt);
		System.out.println("----------------------------------------------------------");
		
		
//1부터 100까지의 수 중에서 4의 배수와 개수(cnt1)를 출력 : for, if  ①
		
/*	int cnt1 = 0;
	System.out.println("○4의 배수");
	for (int i = 1; i<=100; i++){
		if(i % 4 == 0){
			System.out.println(i);
			cnt1++;
		}
	}
		System.out.println("4의 배수의 개수:" + cnt1);
*/		
		
		
		
//1부터 100까지의 수 중에서 4의 배수와 개수(cnt1)를 출력 : for, if  ②
//ln을 지우고 " " 칸띄우기		
/*	int cnt1 = 0;
	System.out.println("○4의 배수");
	for (int i = 1; i<=100; i++){
		if(i % 4 == 0){
			System.out.print(i + " ");
			cnt1++;
		}
	}
		System.out.println("4의 배수의 개수:" + cnt1);

*/		

//1부터 100까지의 수 중에서 4의 배수와 개수(cnt1)를 출력 : for, if  ③
//newline 추가시키기	
/*				int cnt1 = 0;
				System.out.println("○4의 배수");
				for (int i = 1; i<=100; i++){
					if(i % 4 == 0){
						
						System.out.print(i + " ");
						
						cnt1++;
					}//if
				}//for
					System.out.println("\n4의 배수의 개수:" + cnt1);
*/		
		
		
		
//1부터 100까지의 수 중에서 4의 배수와 개수(cnt1)를 출력 : for, if  ④
//10개씩 자르기		

/*		int cnt1 = 0;
		System.out.println("○4의 배수");
		for (int i = 1; i<=100; i++){
			if(i % 4 == 0){
				if(cnt1 % 10 == 0){
							System.out.println();
						}
					
				System.out.print(i + " ");
				cnt1++;
			}//if
		}//for
			System.out.println("\n 4의 배수의 개수:" + cnt1);
*/
					
					
					
					
//1부터 100까지의 수 중에서 4의 배수와 개수(cnt1)를 출력 : for, if  ⑤
// 10보다 작은것에 0추가시키기			
		int cnt1 = 0;
		System.out.println("○4의 배수");
		for (int i = 1; i<=100; i++){
			if(i % 4 == 0){
				if(i % 10 == 0){
					System.out.println();
				}
				if(i < 10){
						System.out.print("0" + i + " ");
						cnt++;
				}else{
					System.out.println(i + " ");
					cnt++;
				}
			}//if
		}//for
			System.out.println("\n 의 배수의 개수:" + cnt1);
						
	System.out.println("--------------------------------------------------------");	
//1 ~ 100 3의 배수 이몀ㄴ서 4의 배수인 수를 출력, 개수(cnt2)출력	

		int cnt2 = 0;
		System.out.println("3&4의 배수:");
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 4 == 0) {
				System.out.print(" " + i);
				cnt2++;
			}

		}
		System.out.println("\n3&4의 배수인 개수:");
		System.out.println(" " + cnt2 + "개");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
