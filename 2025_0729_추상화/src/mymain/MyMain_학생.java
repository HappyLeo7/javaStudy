package mymain;

import myutil.고등학생;
import myutil.중학생;
import myutil.초등학생;
import myutil.학생;

public class MyMain_학생 {
	
	static void 어머님왈(학생[] student_array) {
		
		for(학생 student : student_array) {
			
			// Polymorphism(다형성) : 동일한명령에 따른 각각의 객체가 다른 행동을 한다.
			student.공부하기();
		}
	}
	
	public static void main(String[] args) {
		//Cannot instantiate the type 학생
		//학생 student =new 학생();
		
//		학생 st1 =new 초등학생();
//		학생 st2 =new 중학생();
//		학생 st3 =new 고등학생();
//		//TODO 위아래 코드가 비슷한 의미
//		학생 [] student_array1= {st1,st2, st3};
		
		학생 [] student_array= {new 초등학생(),new 중학생(), new 고등학생()};
		
		어머님왈(student_array);
	}
}
