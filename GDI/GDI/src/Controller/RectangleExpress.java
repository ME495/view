package Controller;

import model.Rectangle;
import model.Shape;

public class RectangleExpress extends Expression{
	NumExpression e=new NumExpression();
	@Override
	public Shape interpret(String context) {
		// TODO Auto-generated method stub
		int[] a = e.interpret(context);
		return new Rectangle(a[0],a[1],a[2],a[3]);
	}
	
}
