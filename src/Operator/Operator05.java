package Operator;
public class Operator05 {
	public static void main(String[] args) {
			//�񱳿����� �� ���ǽ� �ۼ��� ���
			// ������ ����� true, false�� ��ȯ
			//>(grater than) , >= , <(less than), <= : ������ ����� ���� �ε�ȣ ����(���迬��)
			//a = b : ���п����� ���ٶ�� �ǹ�����, ���α׷������� �Ҵ� ������
			//a == b : a�� b�� ����.
			//a != b : a�� b�� �����ʴ�

	int a = 10, b = 5;
	System.out.println(a == b);	//false	
	System.out.println(a != b);	//true
	System.out.println(a > b);	//true
	System.out.println(a >= b); //false
	
	System.out.println(a > 10); //false
	System.out.println(a >= 10);//true
	}

}
