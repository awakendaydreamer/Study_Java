package com.tjo.dao;

import java.text.DecimalFormat;

import com.tjo.dto.JepumDTO;

public class JepumDAO {

	public void price(JepumDTO[] jp){
		for (int i = 0; i < jp.length; i++) {
			jp[i].setPrice(jp[i].getCost() * jp[i].getSu());
		}//for i
	}//price()
	
	public void rank(JepumDTO[] jp){
		for (int i = 0; i < jp.length; i++) {
			int r = 1;
			for (int j = 0; j < jp.length; j++) {
				if (jp[i].getPrice() < jp[j].getPrice()) {
					r++;
				}//if
			}//for j
			jp[i].setRank(r);
		}//for i
	}//rank()
	
	public void print(JepumDTO[] jp){
		DecimalFormat df = new DecimalFormat("#,##0");
		System.out.println("제품명\t단가\t수량\t판매가격\t판매순위");
		System.out.println("=======================================");
		for (int i = 0; i < jp.length; i++) {
			System.out.print(jp[i].getName() + "\t");
			System.out.print(df.format(jp[i].getCost()) + "\t");
			System.out.print(jp[i].getSu() + "\t");
			System.out.print(df.format(jp[i].getPrice()) + "\t");
			System.out.println(jp[i].getRank() );
		}//for i
		System.out.println("=======================================");
	}//print()
	
	public void sortName(JepumDTO[] jp){
		for (int i = 0; i < jp.length; i++) {
			for (int j = i + 1; j < jp.length; j++) {
				if (jp[i].getName().compareTo(jp[j].getName())>0) {
					JepumDTO temp = jp[i];
					jp[i] = jp[j];
					jp[j] = temp;
				}//if
				
			}//for j
		}//for i
	}//sortName()
	
	
}//class
