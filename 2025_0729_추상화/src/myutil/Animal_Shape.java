package myutil;

public class Animal_Shape {
	public void go() {
		Animal[] animal_array = { new Pig(), new Cat(), new Dog() };
		for (Animal animal : animal_array) {
			animal.animal_name();
			animal.cry();
			animal.eat();
		}
		Shape[] shape_array = { new Triangle(), new Nemo(), new Circle() };
		for (Shape shape : shape_array) {
			shape.draw();
		}

	}
}
