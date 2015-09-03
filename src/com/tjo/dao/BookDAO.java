package com.tjo.dao;

import com.tjo.dto.BookDTO;

public class BookDAO {

	//������ ���ϴ� �޼��� : price()
	public void price(BookDTO[] b){
		for (int i = 0; i < b.length; i++) {
			b[i].setPrice(b[i].getCost() * b[i].getSu());
		}//for i
	}//price()
	
	
	//����ϴ� �޼��� : print()
	public void print(BookDTO[] b){
		System.out.println("����\t����\t���ǻ�\t�ܰ�\t����\t����");
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
	
	//������ �������� ���� �޼��� : sortTitle()
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
