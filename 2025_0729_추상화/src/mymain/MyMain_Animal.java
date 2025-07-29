package mymain;

import myutil.Animal;
import myutil.Cat;
import myutil.Dog;
import myutil.Pig;

public class MyMain_Animal {
	public static void main(String[] args) {
		Animal [] animal_array = {new Pig(),new Cat(),new Dog()};
		for(Animal animal : animal_array) {
			animal.animal_name();
			animal.cry();
			animal.eat();
		}
	}
}
