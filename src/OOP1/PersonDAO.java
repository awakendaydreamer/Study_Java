package OOP1;

public class PersonDAO {

	//멤버변수 선언
	private PersonDTO[] p;
	

	
	//생성자 메서드 초기화
	public PersonDAO(PersonDTO[] p) {
		super();
		this.p = p;
	}

	


	//출력하는 메서드 : display()
	public void display(){
		System.out.println("이름\t나이\t키\t체중\t성별");
		System.out.println("====================================");
		for (int i = 0; i < p.length; i++) {
			System.out.println(p[i].getName() + "\t" + p[i].getAge() + "\t" + p[i].getHeight()+"\t" + p[i].getWeight()+"\t" + p[i].getSex());
		}
		System.out.println("====================================");
	}
	
	//나이의 오름차순 정렬하는 메서드 : sortAge()
	public void sortAge(){
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {
				if (p[i].getAge() > p[j].getAge()) {
					PersonDTO temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
	}
	
	//키의 내림차순으로 정렬하는 메서드 : sortHeight()
	
	public void sortHeight(){
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {
				if (p[i].getHeight() < p[j].getHeight()) {
					PersonDTO temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
		
	}
	
	
	public void sortName(){
		for (int i = 0; i < p.length; i++) {
			for (int j = i + 1; j < p.length; j++) {
				if (p[i].getName().compareTo(p[j].getName()) > 0) {	//String Type Sort : compareTo()
					PersonDTO temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}
	}
	
	
	
}
