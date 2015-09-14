package IO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex_14 {

	public static void main(String[] args) {
		//DataInputStream / DataOutputStream : 기본데이터 타입(PDT), 문자열(String)을 쉽게 입출력 기능
		//정의된 자료형의 데이터를 Byte형으로 변환하여 입출력하는 스트림 : 암호화(외계어로 의도하지않게)
		//사용자가 입력한 내용을 파일로 저장(data.txt) : FileOutputStream → DataOutputStream
		//파일에 저장된 내용을 화면에 출력 : FileInputStream → DataInputStream
		int i = 12345;
		float f = 3.14f;
		String s = "홍길동";
		
		try {
			FileOutputStream fos = new FileOutputStream("data.txt");
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeInt(i);//int type → Byte type 으로 변환
			dos.writeFloat(f);//float type → Byte type 으로 변환
			dos.writeUTF(s);//String type → Byte type 으로 변환
			dos.close();
			
			FileInputStream fis = new FileInputStream("data.txt");
			DataInputStream dis = new DataInputStream(fis);
			int ii = dis.readInt();	//byte type → int type 으로 변환
			float ff = dis.readFloat();	//byte type → float type 으로 변환
			String ss = dis.readUTF();	//byte type → Sting type 으로 변환
			dis.close();
			
			System.out.println(ii);
			System.out.println(ff);
			System.out.println(ss);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
