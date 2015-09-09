package PlusMinusGame;

public interface Operator {				//11 인터페이스 클래스
	OpArgs getArgs(int numDigit);			//12
	String getQuestion();					//19
	boolean isEquals(int userAnswer);		//20
}
