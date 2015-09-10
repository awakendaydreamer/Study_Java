package com.tjo.dog;

import java.util.ArrayList;

public class DogDAO {

	
	//	public void display(){							//6
//	}
	public void display(ArrayList<DogDTO> list) {		//9 가인수
		System.out.println("이름\t나이");					//10
		System.out.println("==============");			//11
		
		for (int i = 0; i < list.size(); i++) {			//12 list.size()만큼 출력해야함 얼마만큼 있는지 모르므로
			//System.out.println(list.get(i).getName() + "\t" + list.get(i).getAge());	//13
			DogDTO temp = list.get(i);									//14 list.get(i)가 중복이므로 temp 변수에 담아버림
			System.out.println(temp.getName() + "\t" + temp.getAge());	//15 
		}
		System.out.println("==============");
	}//display()

	//age
	public void ageDescSort(ArrayList<DogDTO> list){					//18
		for (int i = 0; i < list.size(); i++) {							//19
			for (int j = i + 1; j < list.size(); j++) {					//20
				if (list.get(i).getAge() < list.get(i).getAge()) {		//21
					DogDTO temp = list.get(i);							//22
					list.set(i, list.get(j));							//23
					list.set(j, temp);									//24
				}//if
			}//for j
		}//for i
	}//ageDesc()
	
	
}
