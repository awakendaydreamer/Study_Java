package com.tjo.poly03;

public class Tv implements Remocon{

	@Override
	public void volUp() {
		System.out.println("TV 소리를 올린다");
		
	}

	@Override
	public void volDown() {
		System.out.println("TV 소리를 낮춘다");
	}

	@Override
	public void internet() {
		System.out.println("TV가 인터넷에 접속한다.");
	}

}
