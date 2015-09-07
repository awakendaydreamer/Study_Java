import com.tjo.dao.BBookDAO;
import com.tjo.dto.BBookDTO;


public class BBookMain {

	public static void main(String[] args) {
		
		BBookDTO[] b = new BBookDTO[3];
//		b[0] = new BBookDTO();
//		b[1] = new BBookDTO();
//		b[2] = new BBookDTO();
	
	
	BBookDAO bdao = new BBookDAO();
	bdao.input(b);
	bdao.print(b);
	bdao.sortPrice(b);
	bdao.print(b);
	
	
	
	
	}

}
