package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex_16 {

	public static void main(String[] args) {
	//◎ ObjectInputStream// ObjectOutputStream
	//- 객체(상태정보, DTO Class)를 Byte type 변환하여 입출력
	//- 객체의 직렬화 : 객체가 가지고 있는 모든 멤버들이 바이트 열로 바뀌는 것
	//- 객체의 역직렬화 : 직렬화 된 객체가 다시 원래의 객체로 복원되는것
	//
	//★ DTO Class 생성시
	//	public class MemberDTO implements Serializable{ ~~ body ~~ }
	//		▶ 직렬화가 가능하게 정의

		MemberDTO dto = new MemberDTO();
		dto.setNum(503);
		dto.setName("박길동");
		dto.setAge(30);
		dto.setAddr("광주시 동구 서석동");
		dto.setTel("010-1544-1544");
		//위의 회원 1명을 파일에 저장하시오(member.ser)
		//저장된 파일의 내용을 화면에 출력하시오.
		try {
			FileOutputStream fos = new FileOutputStream("member.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(dto);	//객체의 직렬화
			oos.close();
			
			FileInputStream fis = new FileInputStream("member.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			dto = (MemberDTO) ois.readObject();	//객체의 역직렬화
			System.out.print(dto.getNum() + "\t");
			System.out.print(dto.getName() + "\t");
			System.out.print(dto.getAge() + "\t");
			System.out.print(dto.getAddr() + "\t");
			System.out.println(dto.getTel());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
