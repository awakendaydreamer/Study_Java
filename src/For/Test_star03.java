package For;
public class Test_star03 {
	public static void main(String[] args) {

//		for (int i = 0; i <5 ; i++) {
//			for (int j = 0; j < i + 1; j++) {
//				if(i + j > 3){
//					System.out.print("*");      //★  : ㅁ + 한자
// 				}else{
//					System.out.print(" ");		//공백 : ㄱ + 한자
//				}
//			}//for j
//			System.out.println();
//		}

		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {
				if(i+j > 3){
					System.out.print("★");
				}else{
					System.out.print("□");
				}
				
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
