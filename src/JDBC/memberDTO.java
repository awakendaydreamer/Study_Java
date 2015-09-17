package JDBC;

public class memberDTO {

	//①멤버변수 생성
	private int num;
	private String name;
	private int age;
	private String addr;
	private String tel;
	
	//②default 생성자
	public memberDTO() {
	}

	//③생성자 메서드 초기화 : Generate
	public memberDTO(int num, String name, int age, String addr, String tel) {
		super();
		this.num = num;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	
	//Ex_17 오버로딩 : 필요한 멤버변수만 사용하여 생성자 메서드를 재정의
	public memberDTO(int num, int age, String addr, String tel) {
		super();
		this.num = num;
		this.age = age;
		this.addr = addr;
		this.tel = tel;
	}
	
	//④ Getter & Setter Method : Generate

	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}	

	

}
