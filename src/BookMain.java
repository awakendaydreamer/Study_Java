import com.tjo.dao.BookDAO;
import com.tjo.dto.BookDTO;


public class BookMain {

	public static void main(String[] args) {
		//å 3���� ������ �� �ִ� ��ü�迭�� �����ϰ� �ʱ�ȭ
		BookDTO[] b = new BookDTO[3];
		b[0] = new BookDTO("JAVA", "����õ", "������", 30000, 10);
		b[1] = new BookDTO("JSP", "ȫ�浿", "�Ѻ��̵��", 32000, 12);
		b[2] = new BookDTO("Android", "���ڰ�", "������", 28000, 8);
		

		BookDAO bdao = new BookDAO();
		bdao.price(b);		//������ ���ϴ� �޼���
		bdao.print(b);
		bdao.sortTitle(b);	//������ �������� �����ϴ� �޼���
		bdao.print(b);
		bdao.sortPrice(b); 	//������ �������� �����ϴ� �޼���
		bdao.print(b);
		
		
		
	}

}
