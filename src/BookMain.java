import com.tjo.dao.BookDAO;
import com.tjo.dto.BookDTO;


public class BookMain {

	public static void main(String[] args) {
		//책 3권을 저장할 수 있는 객체배열을 생성하고 초기화
		BookDTO[] b = new BookDTO[3];
		b[0] = new BookDTO("JAVA", "강요천", "프리렉", 30000, 10);
		b[1] = new BookDTO("JSP", "홍길동", "한빛미디어", 32000, 12);
		b[2] = new BookDTO("Android", "양자강", "더조은", 28000, 8);
		

		BookDAO bdao = new BookDAO();
		bdao.price(b);		//가격을 구하는 메서드
		bdao.print(b);
		bdao.sortTitle(b);	//제목의 오름차순 정렬하는 메서드
		bdao.print(b);
		bdao.sortPrice(b); 	//가격의 내림차순 정렬하는 메서드
		bdao.print(b);
		
		
		
	}

}
