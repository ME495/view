package Controller;

import model.Oval;
import model.Shape;

public class OvalExpress extends Expression{
	NumExpression e=new NumExpression();

	@Override
	public Shape interpret(String context) {
		// TODO Auto-generated method stub
		int[] a = e.interpret(context);
		return new Oval(a[0], a[1], a[2], a[3]);
	}
	
}
