package Operator;
public class Operator07 {
	public static void main(String[] args) {
		//���׿����� : 3���� ������ �����Ǵ� ������
		//������ ������ �Ǵ��� ��� �� �� ���� �ǹ������� if ~~ else ������ ���
		/*3�׿������� ����*/
		//���ǽ� ? ���� : ������ ;
		
		int a = 10;
		char c1 = a == 10?'O':'X';
		
		//���Ҵ翬���ں��� ���� �� L-value = R - Value;
		//							a == 10 ? 'O' :'X';
		//							  ���ǽ�?     ��  : ����
		
		
		System.out.println(c1);
	 /*---------------------------------------------------------------------------*/
		int b = 10;
		int b1 = b == 10 ? 'O' : 'X';
		
		System.out.println(b1);
		System.out.println((char)b1);
	
	/*--------------------------------------------------------------------------------*/
		char c2 = a != 10 ? 'O' : 'X';
		System.out.println(c2);
		
	/*--------------------------------------------------------------------------------*/	
		String result = a != 10 ? "�´�" : "Ʋ����";
		System.out.println(result);

	/*--------------------------�ǹ� �� 26�� ��� ����.-------------------------------*/
		if(a == 10){
			String dab = "�´�" ;
				System.out.println(dab);			
		} else{
			String dab = "Ʋ����" ;
				System.out.println(dab);
		} //End of if
		
		
	}

}
