package Controller;

import javax.swing.JSpinner.NumberEditor;

import model.Shape;
import model.Triangle;

public class TriangleExpress extends Expression{
	NumExpression e=new NumExpression();

	@Override
	public Shape interpret(String context) {
		int[] a = e.interpret(context);
		return new Triangle(a[0], a[1], a[2], a[3], a[4], a[5]);
	}
}
