package Controller;

import model.Circle;
import model.Shape;

public class CircleExpress extends Expression{
	NumExpression e;
	public CircleExpress(){
		this.e =new NumExpression();
	}
	@Override
	public Shape interpret(String context) {
		System.out.println(context);
		int[] num = e.interpret(context);
		return new Circle(num[0],num[1],num[2]);
	}
	
}
