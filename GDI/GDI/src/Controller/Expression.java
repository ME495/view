package Controller;

import model.Shape;

public abstract class Expression {
	public abstract Shape interpret(String context);
}
