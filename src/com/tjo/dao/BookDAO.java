package com.tjo.dao;

import com.tjo.dto.BookDTO;

public class BookDAO {

	//가격을 구하는 메서드 : price()
	public void price(BookDTO[] b){
		for (int i = 0; i < b.length; i++) {
			b[i].setPrice(b[i].getCost() * b[i].getSu());
		}//for i
	}//price()
	
	
	//출력하는 메서드 : print()
	public void print(BookDTO[] b){
		System.out.println("제목\t저자\t출판사\t단가\t수량\t가격");
		System.out.println("===============================================");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i].getTitle()+"\t");
			System.out.print(b[i].getName()+"\t");
			System.out.print(b[i].getComp()+"\t");
			System.out.print(b[i].getCost()+"\t");
			System.out.print(b[i].getSu()+"\t");
			System.out.println(b[i].getPrice());
			
		}//for i
		System.out.println("===============================================");
	}//print()
	
	//제목의 오름차순 정렬 메서드 : sortTitle()
	public void sortTitle(BookDTO[] b){
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].getTitle().compareTo(b[j].getTitle()) > 0) {
					BookDTO temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}//if
				
			}//for j
		}//for i
	}//fortTitle()

	public void sortPrice(BookDTO[] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].getPrice() < b[j].getPrice()) {
					BookDTO temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}//if
			}//for j
		}//for i
		
	}//sortPrice()
	
}
