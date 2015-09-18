package com.tjo.member_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConn {

	//디폴트 생성자
	private SingleConn() {
	}
	
	//연결객체 생성자
	private static Connection conn;
	
	//static 초기화 블럭  : 가장 먼저 메모리에 로딩 → 실행
	static{
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "system";
		String pw = "12345";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//static

	//getConnect() 메서드 정의
	public static Connection getConnect(){
		return conn;
	}//getConnect()
}//class
