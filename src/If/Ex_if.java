package If;
public class Ex_if {
	public static void main(String[] args) {
		/*
		 * �ܼ� If�� : ������ �Ǵ��Ͽ� ���� ��쿡�� ����
		 * �� if(���ǽ�){
		 * 		���ǽ��� ���϶� ����Ǵ� ����;
		 * }
		 * 
		 * �ؽ���Ǵ� ������ 1���̸� {}�� �����ص� �ȴ�.
		 * 	�� if(���ǽ�) ���๮��;
		 */
	/*---------------�ڵ��ۼ��� ������ �����, ��µ� �״�� �����---------------*/	
		int a = 10;
		boolean modData = a % 2 == 0;  //modData�� �� : true
		if(modData){
			System.out.println("�Է°��� " + a + "�Դϴ�");
			System.out.println("�Է°��� a �Դϴ�");
			System.out.println(a + "�� ¦���Դϴ�.");
		}//End of if
	/* --------------�ڵ��ۼ��� ����, ����� 2��-----------------------*/
		System.out.println("\n");
		
		int b =	9;	
		if(b % 2 !=0){//b�� 2�� ���� ������ ���� 0�� ���� ������ true�� ������ �ȴ�. �� Ȧ��
			System.out.println("�Է°���" + b + "�Դϴ�" + "\n" + b + "�� Ȧ���Դϴ�." );
		}//End of if
		
	/*----------------�ڵ��ۼ�1�� , ��µ� 1��--------------------------*/	
		System.out.println("\n");
		
		int c = 11;
		if(c%2!=0) System.out.println("�ӷ°���" + c + "�Դϴ�.\n" + c + "�� Ȧ���Դϴ�.");
		
		
		
		
		
		
		
		
		
		
	}//End of main()
}//End of Class
