import com.tjo.dao.JepumDAO;
import com.tjo.dto.JepumDTO;


public class JepumMain {

	public static void main(String[] args) {
		JepumDTO[] jp = new JepumDTO[5];
		
		jp[0] = new JepumDTO("수박", 10000, 9);
		jp[1] = new JepumDTO("포도", 3000, 11);
		jp[2] =	new JepumDTO("바나나", 4000, 10);
		jp[3] = new JepumDTO("딸기", 15000, 4);
		jp[4] = new JepumDTO("망고", 3500, 16);
		
		JepumDAO jpdao = new JepumDAO();
		jpdao.price(jp); 		//가격을 계산
		jpdao.rank(jp);			//가격을 기준으로 내림차순 순위
		jpdao.print(jp);		//출력
		jpdao.sortName(jp);		//이름의 오름차순 정렬
		jpdao.print(jp);		//출력
		
	}

}
