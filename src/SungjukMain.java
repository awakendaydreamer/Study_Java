import com.tjo.dao.SungjukDAO;
import com.tjo.dto.SungjukDTO;


public class SungjukMain {

	public static void main(String[] args) {

		SungjukDTO[] sj = new SungjukDTO[3];
		
		sj[0] = new SungjukDTO("홍길동", 2015001, "컴퓨터공학", 87.4F, 93.5F);
		sj[1] = new SungjukDTO("김길동", 2015002, "정보통신과", 67.4F, 63.5F);
		sj[2] = new SungjukDTO("나길동", 2015003, "정보보안과", 94.4F, 73.5F);
		
		SungjukDAO sjdao = new SungjukDAO();
		
		sjdao.sumAvg(sj);//총점과 평균구하기
		sjdao.rank(sj);//순위구하기
		sjdao.sortSum(sj);//총점기준 내림차순 정렬
		sjdao.print(sj);//출력
		sjdao.sortName(sj);//이름기준 오름차순 정렬
		sjdao.print(sj);//출력
		
	}

}
