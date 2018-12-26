package Controller;

import java.util.ArrayList;
import java.util.List;

import model.Circle;
import model.Shape;

public class jiexieqi {

	public List<Shape> jiexie(List<String> strings) {
		List<Shape> list = new ArrayList<>();
		Shape shape = null;
		for (String string : strings) {
			if(string.charAt(string.length()-1)=='\n'){
				string=string.substring(0, string.length()-1);
			}
			System.out.println(1);
			string = string.toLowerCase();
			if (string.contains("circle")) {
				Expression circleExpress = new CircleExpress();
				System.out.println(string);
				shape = circleExpress.interpret(string);
			} else if (string.contains("rectangle")) {
				Expression rectangle = new RectangleExpress();
				shape = rectangle.interpret(string);
			} else if (string.contains("oval")) {
				Expression oval = new OvalExpress();
				shape = oval .interpret(string);

			} else if (string.contains("triangle")) {
				Expression triangle = new TriangleExpress();
				shape = triangle .interpret(string);
			}
			list.add(shape);
		}

		return list;
	}
}

/*
 * cicle rectan oval t
 */