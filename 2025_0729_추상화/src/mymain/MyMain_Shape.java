package mymain;

import myutil.Circle;
import myutil.Nemo;
import myutil.Shape;
import myutil.Triangle;

public class MyMain_Shape {
	public static void main(String []args) {
		Shape[] shape_array = {new Triangle(),new Nemo(),new Circle()};
		for(Shape shape : shape_array) {
			shape.draw();
		}
	}
}
