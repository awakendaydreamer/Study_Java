package Operator;

public class Operator08 {
	public static void main(String[] args) {
		// ���α׷����� ���Ǵ� Ư������(escape sequence) : ��¹����� ���� ���
		// ��������(\)�� ���� �Է��ϰ� ����Ѵ�.

		System.out.println("1.HelloWorld");
		System.out.println("2.Hello" + "\t" + "World"); // \t:�ǰ���(8ĭ ����) ��
		System.out.println("2.Hello\tWorld"); // ���ڿ� ��¹� �ȿ��� ��밡��
		System.out.println("3.Hello" + "\n" + "World"); // New line (�ٹٲ�) ��
		System.out.println("4.Hello" + "\b" + "World"); // Back space(��ĭ�ڷ� �̵�)
		System.out.println("5.Hello" + "\r" + "World"); // Carriage Return(��ٲ�)
		System.out.println("6.Hello" + "\'" + "World"); // ��������ǥ ǥ��
		System.out.println("7.Hello" + "\"" + "World"); // �ֵ���ǥ ǥ��
		System.out.println("8.Hello" + "\\" + "World"); // (�� ������,Root)ǥ��

		System.out.println("��ȣ" + "\t" + "�̸�" + "\t" + "����ó" + "\t" + "\t"
				+ "�ּ�");
		System.out.println("001\tȫ�浿\t123-4569\t���� ���� ��õ��");
		System.out.println("001\tȫ�浿\t123-4569\t���� ���� ��õ��");
		System.out.println("001\tȫ�浿\t123-4569\t���� ���� ��õ��");
		System.out.println("001\tȫ�浿\t123-4569\t���� ���� ��õ��");
	}

}
