import java.util.ArrayList;
import java.util.Scanner;

import Fruit.FruitDAO;
import Fruit.FruitDTO;


public class FruitMain {

	public static void main(String[] args) {
		ArrayList<FruitDTO> list = new ArrayList<FruitDTO>();

		list.add(new FruitDTO("사과", 5000, 5));
		list.add(new FruitDTO("바나나", 3000, 6));
		list.add(new FruitDTO("딸기", 6000, 4));
		list.add(new FruitDTO("오렌지", 1600, 7));
		list.add(new FruitDTO("메론", 8000, 4));
		
		
		FruitDAO dao = new FruitDAO();
		//금액(cost * su) 을 구하는 메서드
		System.out.println("입력하신 자료는 아래와 같습니다.");
		dao.price(list);
		dao.display(list);
		
		//금액의 내림차순으로 정렬하는 메서드 정의
		System.out.println("금액을 기준으로 내림차순으로 정렬");
		dao.priceSortDesc(list);
		dao.display(list);
		
		//ArrayList<>의 내용을 출력하는 메서드 정의
		System.out.println("======ArrayList<>의 내용을 출력======");
		dao.display(list);
		//과일명 오름차순
		System.out.println("==========오름차순===========");
		dao.ascSort(list);
		dao.display(list);
		
		//과일명을 입력받아 검색하는 메서드 정의 → 2진검색
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 과일명을 입력하세요 : ");
		String sd = sc.nextLine();
		sc.close();
		int index = dao.nameSearchBin(list, sd);
		
		if (index == -1) {
			System.out.println("입력하신 이름은 " + sd + "입니다.");
		}else{
			System.out.println("입력하신 이름은 " + sd +"이며, 단가는" + list.get(index).getCost()+"이고, 주문수량은 " + list.get(index).getSu()+"이며, 총 금액은 "+ list.get(index).getPrice()+ "입니다");
		}
	}//main()
}//class
