import com.tjo.dao.JepumDAO;
import com.tjo.dto.JepumDTO;


public class JepumMain {

	public static void main(String[] args) {
		JepumDTO[] jp = new JepumDTO[5];
		
		jp[0] = new JepumDTO("����", 10000, 9);
		jp[1] = new JepumDTO("����", 3000, 11);
		jp[2] =	new JepumDTO("�ٳ���", 4000, 10);
		jp[3] = new JepumDTO("����", 15000, 4);
		jp[4] = new JepumDTO("����", 3500, 16);
		
		JepumDAO jpdao = new JepumDAO();
		jpdao.price(jp); 		//������ ���
		jpdao.rank(jp);			//������ �������� �������� ����
		jpdao.print(jp);		//���
		jpdao.sortName(jp);		//�̸��� �������� ����
		jpdao.print(jp);		//���
		
	}

}
