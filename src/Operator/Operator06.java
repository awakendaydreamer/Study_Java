package Operator;
public class Operator06 {
	public static void main(String[] args) {
		//�Ҵ翬����(=) : =(equal)�� ����(==)��� �ǹ̰� �ƴ� �Ҵ��Ѵٸ� �ǹ� �� ���Կ�����
		// L - Value = R - Value : R-Value�� ��(������)�� L-Value�� ����(�Ҵ�)
		
		int a = 10; //����,�Ҵ� �� �ʱ�ȭ
		System.out.println("a�� �� : " + a);
		
		int b = a; 	//����, �Ҵ� �� �ʱ�ȭ
		System.out.println("b�� �� : "+ b);
		
		b = a + a;  //���Ҵ�	
		System.out.println("b�� �� : " + b);
		
		a = a + a;  //���Ҵ�
		System.out.println("a�� �� : " + a);
		
		a = a + a;
		System.out.println(a);

		
		/*���մ��Կ�����(��)*/
		
		a += a; //a = a + a;
		System.out.println("a�� �� : " + a);
		
		b =+ b;	//b = b + b;
		System.out.println("b�� �� : " + b);
		
		
		int x = 10;
		x = x + 100;
		
		System.out.println("x�� �� : " + x);
		
		
		int y = 10;
		y += 100;
		System.out.println("y�� �� : " + y);
		
		
		
		
		
	} //End of main()

} //End of Class
