import com.tjo.dao.JepumDAO02;
import com.tjo.dto.JepumDTO02;


public class JepumMain02 {

	public static void main(String[] args) {
		JepumDTO02[] jp = new JepumDTO02[5];

		jp[0] = new JepumDTO02("사과", 5000);
		jp[1] = new JepumDTO02("바나나", 3000);
		jp[2] = new JepumDTO02("딸기", 6000);
		jp[3] = new JepumDTO02("오렌지", 1600);
		jp[4] = new JepumDTO02("메론", 8000);
		
		JepumDAO02 jpdao = new JepumDAO02();
		jpdao.printtable(jp);
		jpdao.print(jp);
//		jpdao.SeqSearch(jp);
//		jpdao.printtable(jp);
		jpdao.nameBinSearch(jp);
		jpdao.printtable(jp);
		
		
		
		
	}

}
