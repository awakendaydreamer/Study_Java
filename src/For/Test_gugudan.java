package For;

public class Test_gugudan {

	public static void main(String[] args) {
		
		for (int i = 2; i <=9 ; i++) {
			for (int j = 1; j <= 9 ; j++) {
				
				if(i*j <10){
					System.out.print(i + "X" + j + "=" + "0" + i*j + "\t");
				}else{
					System.out.print(i + "X" + j + "=" + i*j + "\t");
				}
				
					
			}//for j
			System.out.println();
		}//for i
	System.out.println("==========================================================");		

			for (int i = 1; i <= 9; i++) {
				for (int j = 2; j <= 9; j++) {
					System.out.print(j + "X" + i + "=" + i * j + "\t");
				}
				System.out.println();
			}		
			

	}

}
