package com.tjo.poly03;

public class Radio implements Remocon{

	@Override
	public void volUp() {
		System.out.println("라디오 소리를 올린다");
		
	}

	@Override
	public void volDown() {
		System.out.println("라디오 소리를 낮춘다");
		
	}

	@Override
	public void internet() {
		System.out.println("라디오는 인터넷 접속기능이 없다.");
		
	}

}
