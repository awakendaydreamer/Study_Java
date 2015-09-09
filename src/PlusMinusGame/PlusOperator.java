package PlusMinusGame;

public class PlusOperator implements Operator {			//20

	int a;													//22
	int b;													//23
	@Override
	public OpArgs getArgs(int numDigit) {
		a = (int)((Math.random() * numDigit) + 1);				//24
		b = (int)((Math.random() * numDigit) + 1);				//25
		return new OpArgs(a,b);									//26
	}

	@Override
	public String getQuestion() {
		
		return "%d + %d = ";									//27
	}

	@Override
	public boolean isEquals(int userAnswer) {
		// TODO Auto-generated method stub
		return (a + b) == userAnswer ;							//31
	}

}
