package OOP1;

public class BookDTO {
	//① 멤버변수 : 제목(title), 가격(price), 저자(auth), 출판사(pub)
	//변수의 상태정보를 은닉시켜야함 → 정보은닉 : private
	
	private String title;		//①멤버변수 선언
	private int price;
	private String auth;
	private String pub;
	
	
	//② 기본 생성자 메서드 (Default Constructor) : 클래스의 이름과 메서드의 이름이 같다.
	public BookDTO(){
		
	}//기본 생성자 메서드 : 빈 깡통

	//③ 정의된 멤버변수를 매개변수로 4개의 값을 받아 초기화하는 생성자 메서드 정의
		// 멤버변수 4개를 1개로 묶어준다 ▶ 초기화
		//이클립스에서 자동으로 제공해줌(parameter)
		//source MenuBar(마오 >> Source) >> Generate Constructor using Fields...
	public BookDTO(String title, int price, String auth, String pub) {
		super();
		this.title = title;
		this.price = price;
		this.auth = auth;
		this.pub = pub;
	}

	
	
	//④ 입력(Setter), 출력(Getter) 메서드를 정의 : 이클립스에서 자동으로 제공
	//Source MenuBar(마오 > Source) >> Generate Getters and Setters ...	
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getPub() {
		return pub;
	}

	public void setPub(String pub) {
		this.pub = pub;
	}
	
	
	




}
