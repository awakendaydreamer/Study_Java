package Operator;

public class Operator04 {
	public static void main(String[] args) {

		// �������� : �������� ������ ���������� �Ǵ� �� ���ǹ��ۼ�
		// ������ ����� true, false�� ��ȯ
		// ����A && ����B : ����A�� ���̰� ���� B�� ���ϰ�� �� ��(true)���� ���
		// ����A || ����B : ����A �Ǵ� ����B �߿��� ��� �ϳ��� ���ϰ�� �� ��(true)���� ���
		// AND���� : ~~�̸鼭, ~~�̰�
		// OR ���� : ~~�̰ų�, ~~�Ǵ�
		//한글됩니다.
		System.out.println(10 > 5 && 20 > 5);	//true(1) && true(1) = true(1)
		System.out.println(10 > 5 && 20 < 5);	//true(1) && false(0) = false(0) 
		System.out.println(10 < 5 && 20 > 5);	//false(0) && true(1) = false(0)
		System.out.println(10 < 5 && 20 < 5);	//false(0) && false(0) = false(0)
		System.out.println("--------------");
		System.out.println(10>5 || 20<5);		//true(1) || true(1) = true(1)
		System.out.println(10>5 || 20<5);
		System.out.println(10>5 || 20<5);
		System.out.println(10>5 || 20<5);
		

	}

}
