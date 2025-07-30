package mymain;

import java.util.Iterator;

import myutil.Bird;
import myutil.BirdFactory;
import myutil.Eagle;
import myutil.Sparrow;

public class MyMain_Bird {
	public static void main(String[] args) {
//		Bird [] bird = {new Eagle() ,new Sparrow()};
		Bird [] bird = 
			{BirdFactory.getInstence().getEagle() ,BirdFactory.getInstence().getSparrow()};
		for(Bird b : bird) {
			String c=b.fly();
			System.out.printf("%s\n",c);
			String a=b.eat();
			System.out.printf("%s\n",a);
		}
	}
}
