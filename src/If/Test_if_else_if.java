package If;
public class Test_if_else_if {
	public static void main(String[] args) {

/*-------------------------------------���� if----------------------------------*/		
		//�����ڵ�(code)�� 1�̸� '����', 2�̸�'����', 3�̸�'����', 4�̸�'����'
		//�׿ܴ� �����޼���('�����ڵ尡 �߸� �ԷµǾ����ϴ�')���

		int code = 3;
		
/*-----------------------------------�⺻ ����if ----------------------------------*/		
		if(code == 1){
			System.out.println("����");
		}else if(code == 2){
			System.out.println("����");
		}else if(code == 3){
			System.out.println("����");
		}else if(code == 4){
			System.out.println("����");
		}else{
			System.out.println("�����ڵ尡 �߸� �ԷµǾ����ϴ�.");
		}//End of if
		
/*------------------------------------�������� ������ ���� if -----------------------*/		
		if (code == 1 || code == 3){
			System.out.println("����");
		}else if (code == 2 || code == 4){
			System.out.println("����");
		}else {
			System.out.println("�����ڵ尡 �߸� �ԷµǾ����ϴ�.");
		}
	
	
	}//End of main()
}//End of class
