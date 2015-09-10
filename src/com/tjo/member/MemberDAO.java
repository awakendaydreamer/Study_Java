package com.tjo.member;

import java.util.ArrayList;

public class MemberDAO {

	public void display(ArrayList<MemberDTO> list) {
		
		System.out.println("이름 \t 나이 \t 주소 \t\t 전화번호");
		System.out.println("=============================================");
		for (int i = 0; i < list.size(); i++) {
			MemberDTO temp = list.get(i);
			System.out.println(temp.getName() + "\t" + temp.getAge() + "\t" + temp.getAddr() + "\t" + temp.getTel());
		}
		System.out.println("=============================================");
	}//display()

	public void nameAscSort(ArrayList<MemberDTO> list) {
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).getName().compareTo(list.get(j).getName()) > 0 )  {
					MemberDTO temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}//if
			}//for j
		}//for i
		
	}//nameAscSort()

	public int nameSearch(ArrayList<MemberDTO> list, String sd) {
		int index = -1;
		int low = 0, middle = 0, high = list.size() - 1;
		while(low <= high){
				middle = (low + high)/2;
				if (list.get(middle).getName().compareTo(sd) == 0) {
					index = middle;
					break;
				}else if (list.get(middle).getName().compareTo(sd) >0  ){
					low = middle + 1;
				}

		}
		return index;
		
		
	}//nameSearch()
}//class
