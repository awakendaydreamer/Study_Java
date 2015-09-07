import com.tjo.dao.SungjukDAO;
import com.tjo.dto.SungjukDTO;


public class SungjukMain {

	public static void main(String[] args) {

		SungjukDTO[] sj = new SungjukDTO[3];
		
		sj[0] = new SungjukDTO("ȫ�浿", 2015001, "��ǻ�Ͱ���", 87.4F, 93.5F);
		sj[1] = new SungjukDTO("��浿", 2015002, "������Ű�", 67.4F, 63.5F);
		sj[2] = new SungjukDTO("���浿", 2015003, "�������Ȱ�", 94.4F, 73.5F);
		
		SungjukDAO sjdao = new SungjukDAO();
		
		
		sjdao.rank(sj);//�������ϱ�
		sjdao.sortSum(sj);//�������� �������� ����
		sjdao.print(sj);//���
		sjdao.sortName(sj);//�̸����� �������� ����
		sjdao.print(sj);//���
		
	}

}
