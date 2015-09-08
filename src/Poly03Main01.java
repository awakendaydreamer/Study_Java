import com.tjo.poly03.Radio;
import com.tjo.poly03.Remocon;
import com.tjo.poly03.Tv;


public class Poly03Main01 {

	public static void main(String[] args) {
		//Remocon Class 로 TV의 소리를 올리고 내린후에 인터넷에 접속
		Remocon remocon = new Tv();	//UpCasting
		
		remocon.volDown();
		remocon.volDown();
		remocon.internet();
		System.out.println("----------------------");
		
		
		//Remocon Class 로 Radio의 소리를 올리고 내린후 인터넷에 접속
		remocon = new Radio();
		remocon.volUp();
		remocon.volDown();
		remocon.internet();
		System.out.println("----------------------");

	}

}
