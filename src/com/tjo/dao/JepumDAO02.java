package com.tjo.dao;

import java.util.Scanner;

import com.tjo.dto.JepumDTO02;

public class JepumDAO02 {

	Scanner sc = new Scanner(System.in);
	
	private Object searchData;

	public void print(JepumDTO02[] jp){

			System.out.println("검색하실 과일명을 입력하세요 (seqSearch): ");
			String inputName = sc.nextLine();

		for (int i = 0; i < jp.length; i++) {

			if (jp[i].getName().equals(inputName)) {
				System.out.println("입력하신 과일명은 " + jp[i].getName() + "이며,");
				System.out.println("가격은" + jp[i].getPrice() + " 입니다.");
			} else {
				System.out.println("입력하신 과일명은 " + inputName + "이며,");
				System.out.println("검색항목에 없습니다.");
			}// if
		}// for i
				
			
			
	
//		sc.close();
		System.out.println();
	}
	
	
	public void printtable(JepumDTO02[] jp){
		
		System.out.println("과일명 \t 가격");
		System.out.println("==================");
		for (int i = 0; i < jp.length; i++) {
			System.out.print(jp[i].getName() + "\t");
			System.out.println(jp[i].getPrice());
		}
		System.out.println("==================");
		
	}
	
	public void SeqSearch(JepumDTO02[] jp){
		int index = -1;
		for (int i = 0; i < jp.length; i++) {
			if (jp[i].getName().equals(index)) {
				index = i;
				break;
			}

			if(searchData.equals(jp[i].getName())){
				index = i;
				break;
			}//if
		
		}//for
		
	}//seqsearch()



	public void nameBinSearch(JepumDTO02[] jp) {
		//1.오름차순
		for (int i = 0; i < jp.length; i++) {
			for (int j = i + 1; j < jp.length; j++) {
				if (jp[i].getName().compareTo(jp[j].getName()) > 0) {
					JepumDTO02 temp = jp[i];
					jp[i] = jp[j];
					jp[j] = temp;
				}
			}//for j
		}//for i
		
		
		//2.bin search
			//이진검색(Binary Search) : low, high, middle 사용
			//찾고자 하는 데이터를 중앙에 위치한 중간값과 비교하는 방법
			//데이터가 사전에 오름차순으로 정렬되어 있어야 한다(전제조건)

		
		
		System.out.println("검색하실 과일명을 입력하세요 (binSearch):");
		String searchData = sc.nextLine();
		sc.close();
		
		int index = -1;
		int low = 0, middle = 0, high = jp.length -1;
		while(low <= high){
			middle = (low + high) / 2;
			if(searchData.equals(jp[middle].getName())){
				index = middle;
				break;
			}else if(searchData.compareTo(jp[middle].getName())>0 ){
				//찾는 값이 더 크다 → 중간값을 기준으로 왼쪽부분을 잘라낸다.(low가 쑥 올라감)
				low = middle +1;
			}else{
				//찾는 값이 더 작다 → 중간값을 기준으로 오른쪽 부분을 잘라낸다.(high가 쑥 내려감)
				high = middle -1;
			}
		}
		if (index == -1) {
			System.out.println("찾는 수는 " + searchData + "이며, 검색에 실패하였습니다.");
		}else{
			System.out.println("찾는 수는 " + searchData + "이며, " + (index + 1) + "번째에 있습니다.");
		}
	}

}
