package Exception;

public class Exception05 {

	public static void main(String[] args) {
		// 1 ~ 100 까지의 누적합(sum)을 구하여 출력하시오
		//단, 누적합이 888 이상이 되면 반복을 중지(break;)하고 그때까지의 결과값을 출력
		//단, try ~~ catch ~~ 블럭을 이용하여 예외처리 (throw) 하시오
		int sum = 0, cnt = 0;
		
		
		try {
			for (int i = 1; i <= 100; i++){
				sum += i;
				cnt ++;
				if (sum >= 888) {
					//break;
					throw new Exception("888 이상이 되었습니다.");	//예외를 만들어서 던짐(catch)
				}//if
			}//for
			System.out.println(sum);
			System.out.println(cnt);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}//main()
}//class

//throw : 강제로 예외를 발생시키는 것 → 코드 바깥으로(catch 블럭) 예외를 던질 때 사용
//throws : 예외를 처리하는 기법(예외 미루기) → 메서드의 선언부에서 사용
//예)public void job(){ ~~body~~} ▶ public void job() throws XXXException