import java.util.ArrayList;

import com.tjo.dog.DogDAO;
import com.tjo.dog.DogDTO;


public class DogMain {

	public static void main(String[] args) {
		ArrayList<DogDTO> list = new ArrayList<DogDTO>();			//1
		list.add(new DogDTO("멍멍이", 3));							//2
		list.add(new DogDTO("복실이", 7));							//3
		list.add(new DogDTO("강아지", 5));							//4
//		System.out.println(list);									//5
		
		
		DogDAO dao = new DogDAO();									//7
		dao.display(list);		//실인수 : list						//8
		dao.ageDescSort(list);	//나이의 내림차순 정렬									//16	
		dao.display(list);									//17
	}

}
