package mymain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _11_시험4_자료구조시험 {
	public static void main(String[] args) {
		int [] arr = {80,21,33,70,91,70,56,60,21,100,42,30,91};
		
		//조건1.중복되지 않도록 
		//조건2. 7의 배수만 filter 함수 사용해서 필터할것
		//조건3. 아래와 같이 역순으로 정렬해서 출력
		
		//배열strame에 넣고 IntStream 에 넣는다.
		IntStream intStream = Arrays.stream(arr);
		
		String result = intStream.boxed()
							     .distinct() //중복 제거
							     .sorted() //오름차순정렬
							     .filter(n->n%7==0) //7의 배수
				                 .map(n->" "+n) //숫자를 문자로 바꿔줌  " " + 80 =>문자로 변환
//				                 .reduce("", (a,b)->a+b); // 출력 순서
				                 .reduce("", (a,b)->b+a); //	
		
		System.out.println(result);
		//결과 출력 (중복체크 / 정렬 / 7의 배수)
		//91 70 56 42 21
	}
}
