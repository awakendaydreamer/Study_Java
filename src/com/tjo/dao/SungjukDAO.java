package com.tjo.dao;

import com.tjo.dto.SungjukDTO;

public class SungjukDAO {
	
	public void sumAvg(SungjukDTO[] sj) {
		for (int i = 0; i < sj.length; i++) {
			float sum = 0;
			float avg = 0;
			
			sum = sj[i].getJava() + sj[i].getCpp();
			
			sj[i].setSum(sum);		
			
			avg = sum/2;
			sj[i].setAvg(avg);
			
		}//for
	}//sumAvg()

	
	
	public void rank(SungjukDTO[] sj){
		for (int i = 0; i < sj.length; i++) {
			int r = 1;
			for (int j = 0; j < sj.length; j++) {
				if (sj[i].getAvg() < sj[j].getAvg()) {
					r++;
				}//if
				sj[i].setRank(r);
			}//for j
		}
	}//rank()


	public void sortSum(SungjukDTO[] sj) {
		for (int i = 0; i < sj.length; i++) {
			for (int j = i + 1; j < sj.length; j++) {
				if (sj[i].getSum() < sj[j].getSum()) {
				SungjukDTO	temp = sj[i];
					sj[i] = sj[j];
					sj[j] = temp;
				}
			}
		}
		
	}


	public void print(SungjukDTO[] sj) {
		System.out.println("이름\t학번\t학과\tJAVA\tC++\t총점\t평균\t순위");
		System.out.println("===================================================");
		for (int i = 0; i < sj.length; i++) {
			System.out.print(sj[i].getName() + "\t");
			System.out.print(sj[i].getHakbun() + "\t");
			System.out.print(sj[i].getMajor() + "\t");
			System.out.print(sj[i].getJava() + "\t");
			System.out.print(sj[i].getCpp() + "\t");
			System.out.print(sj[i].getSum() + "\t");
			System.out.print(sj[i].getAvg() + "\t");
			System.out.println(sj[i].getRank());
		}
		System.out.println("===================================================");
	}


	public void sortName(SungjukDTO[] sj) {
		for (int i = 0; i < sj.length; i++) {
			for (int j = i + 1; j < sj.length; j++) {
				if (sj[i].getName().compareTo(sj[j].getName()) > 0) {
				SungjukDTO	temp = sj[i];
					sj[i] = sj[j];
					sj[j] = temp;
				}
			}
		}
		
	}



	
}//class
