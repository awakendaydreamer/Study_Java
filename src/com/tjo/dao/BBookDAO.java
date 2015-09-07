package com.tjo.dao;

import java.util.Scanner;

import com.tjo.dto.BBookDTO;


public class BBookDAO {

	
	public void input(BBookDTO[] b) {
		
		Scanner sc = new Scanner(System.in);


		for (int i = 0; i < b.length; i++) {
			System.out.print(i+1 +"번째 제목을 입력하세요 :");
			String title = sc.nextLine();
//			b[i].setTitle(title);
			System.out.print(i+1 +"번째 가격을 입력하세요 :");
			int price = sc.nextInt();
			sc.nextLine();
//			b[i].setPrice(price);
			System.out.print(i+1 +"번째 저자를 입력하세요 :");
			String name = sc.nextLine();
//			b[i].setName(name);
			System.out.print(i+1 +"번째 출판사를 입력하세요 :");
			String company = sc.nextLine();
//			b[i].setCompany(company);
			System.out.println("====================");
			b[i] = new BBookDTO(title, price, name, company);
			
		}//for i
	}//input()
	
	
	public void print(BBookDTO[] b) {
		System.out.println("제목\t가격\t저자\t출판사");
		System.out.println("===================================");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i].getTitle() + "\t");
			System.out.print(b[i].getPrice() + "\t");
			System.out.print(b[i].getName() + "\t");
			System.out.println(b[i].getCompany());
		}//for i
	System.out.println();
	}//print()

	
	public void sortPrice(BBookDTO[] b) {
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].getPrice() < b[j].getPrice()) {
					BBookDTO temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}//if
			}//for j
		}//for i
		
	}//sortPrice()
	
	public void sortTitle(BBookDTO[] b){
		for (int i = 0; i < b.length; i++) {
			for (int j = i + 1; j < b.length; j++) {
				if (b[i].getTitle().compareTo(b[j].getTitle()) > 0) {
					BBookDTO temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}//if
				
			}//for j
		}//for i
	}//fortTitle()
	
	
	
	
}
