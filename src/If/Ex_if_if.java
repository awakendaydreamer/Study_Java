package If;

public class Ex_if_if {
	public static void main(String[] args) {
/*-------------------------��ø if-----------------------------------------------*/
	/*
	 * ����ø if �� : if�� �ȿ� �ٸ� if���� �ִ� ����
	 * 
	 * if(���ǽ�B){
	 * 	if(���ǽ�1){
	 * 		����B�� ������ ���¿��� ����1�� ���϶� ����Ǵ� ����;
	 * 	 }else if(���ǽ�2){
	 * 		����B�� ������ ���¿��� ������2�� ���϶� ����Ǵ� ����;
	 * 	 }else if(���ǽ�3){
	 * 		����B�� ������ ���¿��� ����3�� ���϶� ����Ǵ� ����; 
	 * 	}else{
	 * 		���� B�� ������ ���¿��� �����϶� ����Ǵ� ����;
	 * }
	 */

		int jumsu = -7;

		if (jumsu >= 0 && jumsu <= 100) {
			if (jumsu >= 90) {
				System.out.println("A����");
			} else if (jumsu >= 80) {
				System.out.println("B����");
			} else {
				System.out.println("������ �߸� �Է��ϼ̽��ϴ�.");
			}
		} else {
			System.out.println("0~100 ��ġ�� ������ ������ϴ�.");
		}// End of if

	}// End of main()
}// End of class
