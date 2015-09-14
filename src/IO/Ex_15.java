package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_15 {

	public static void main(String[] args) {
		//현재까지의 게임 정보(상태)를 암호화하여 game.data 파일에 저장
		//FileOutputStream → DataOutputStream (자동으로 암호화가 되어버림)
		String id = "tjoeun";
		String user = "더조은";
		int level = 4;
		int money = 123450;
		float jumsu = 3456.78f;
	
		try {
			FileOutputStream fos = new FileOutputStream("game.data");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeUTF(id);
			dos.writeUTF(user);
			dos.write(level);
			dos.writeInt(money);
			dos.writeFloat(jumsu);
			dos.close();
			
			FileInputStream fis = new FileInputStream("game.data");
			DataInputStream dis = new DataInputStream(fis);
			String ss = dis.readUTF();
			float ff = dis.readFloat();
			int ii = dis.readInt();
			dis.close();
			
			System.out.println(ss);
			System.out.println(ii);
			System.out.println(ff);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}//main
}


/*
	◎ DataInputStream // DataOutputStream
		- 기본 자료형(PDT) 문자열 (String) 의 데이털르 Byte type 변환 하여 입출력
	
	◎ ObjectInputStream// ObjectOutputStream
		- 객체(상태정보, DTO Class)를 Byte type 변환하여 입출력
		- 객체의 직렬화 : 객체가 가지고 있는 모든 멤버들이 바이트 열로 바뀌는 것
		- 객체의 역직렬화 : 직렬화 된 객체가 다시 원래의 객체로 복원되는것
	
		★ DTO Class 생성시
			public class MemberDTO implements Serializable{ ~~ body ~~ }
				▶ 직렬화가 가능하게 정의

	◎ MemberDTO.class
		- 번호(num), 이름(name), 나이(age), 주소(addr), 전화번호(tel)


*/