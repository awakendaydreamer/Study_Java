package PlusMinusGame;

public class MinusOperator implements Operator {			//44

	int a;														//45
	int b;														//46
	@Override
	public OpArgs getArgs(int numDigit) {
		a = (int)((Math.random() * numDigit) + 1);					//47
		b = (int)((Math.random() * numDigit) - a);					//48
		return new OpArgs(a,b);										//49
	}

	@Override
	public String getQuestion() {
		return "%d - %d = ";										//50
	}

	@Override
	public boolean isEquals(int userAnswer) {
		// TODO Auto-generated method stub
		return (a - b) == userAnswer ;								//51
	}

}
