package OOP1;

public class PersonDTO {
	// ① 멤버변수 (상태정보)
	private String name;
	private int age;
	private float height;
	private float weight;
	private char sex;

	// ② default structure 생성

	public PersonDTO() {
	}

	// ③생성자 메서드 초기화 : 자동생성
	public PersonDTO(String name, int age, float height, float weight, char sex) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.sex = sex;
	}

	// ④Getter and Setter : 자동생성
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

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public char getSex() {
		return sex;
	}

	public void setSex(char sex) {
		this.sex = sex;
	}

}
