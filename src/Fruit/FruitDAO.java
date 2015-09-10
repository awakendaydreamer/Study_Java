package Fruit;

import java.text.DecimalFormat;
import java.util.ArrayList;

import com.tjo.array.A;

public class FruitDAO {

	//금액(price)계산
	public void price(ArrayList<FruitDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			int price = list.get(i).getCost() * list.get(i).getSu();
			list.get(i).setPrice(price);
		}//for i
	}//price()

	//금액의 내림차순 정렬
	public void priceSortDesc(ArrayList<FruitDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getPrice() < list.get(j).getPrice()) {
					FruitDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for j
		}//for i
	}//PriceSortDesc()

	public void display(ArrayList<FruitDTO> list) {
		DecimalFormat df = new DecimalFormat("￦#,##0");//ㄹ → ￦
		System.out.println("==============================");
		System.out.println("name\tcost\tsu\tprice");
		System.out.println("==============================");
		
		for (int i = 0; i < list.size(); i++) {	//size() : arrList의 길이(크기)
			FruitDTO temp = list.get(i);
			System.out.println(temp.getName()+"\t"+df.format(temp.getCost())+"\t"+temp.getSu()+"\t"+df.format(temp.getPrice()) );			//get() : 출력(가져온다)
			
		}//for i
		System.out.println("=============================");
	}//display()

	public int nameSearchBin(ArrayList<FruitDTO> list, String sd) {
		int index = -1;
		int low =0, middle = 0, high = list.size() -1;
		while(low <= high){
			middle = (low + high)/2;
			if (list.get(middle).getName().compareTo(sd) == 0){
				index = middle;
				break;
			}else if(list.get(middle).getName().compareTo(sd) != 0){
				low = middle +1;
			}//if
		}//while
		return index;
	}//nameSearchBin
	
	public void ascSort(ArrayList<FruitDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
				if (list.get(i).getName().compareTo(list.get(j).getName()) > 0 ) {
					FruitDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for j
		}//for i
	}//ascSort

	

}//class
