package OOP1;

public class PersonMain {

	public static void main(String[] args) {
		//3명의 개인정보(이름, 나이, 키, 몸무게, 성별)를 저장할 객체배열
		PersonDTO[] p = new PersonDTO[3]; //객체배열 선언(생성)
		p[0] = new PersonDTO("홍길동" , 18, 175.5F, 75F, 'M');
		p[1] = new PersonDTO("나길동" , 30, 172F, 65.5F, 'M');
		p[2] = new PersonDTO("성춘향" , 25, 165.4F , 42.7F, 'F');
		
		//객체배열의 내용을 출력(display())
		PersonDAO dao = new PersonDAO(p);
		dao.display();
		
		//나이의 오름차순 정렬(sortAge())하고 출력(display())
		dao.sortAge();
		dao.display();
		
		//키의 내림차순 정렬(sortHeight())하고 출력(display())
		dao.sortHeight();
		dao.display();
		
		//이름의 오름차순으로 정렬하고(sortName()하고 출력(display())
		dao.sortName();
		dao.display();
	}

}
