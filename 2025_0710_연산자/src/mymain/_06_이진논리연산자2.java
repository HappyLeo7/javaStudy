package mymain;

public class _06_이진논리연산자2 {

	public static void main(String[] args) {

		int birthday = 0x19991225;
		//            0001  1001  1001  1001  0001  0010  0010  0101  (0x19991225 2진수로 변환)
		
		System.out.printf("생년월일 : %x\n",birthday);
		
		//출생년도 추출
		int year =  birthday >>> 16;  //>>>은 16칸 오른쪽으로 밀고 빈공간0으로채운다
		System.out.printf("출생년도 : %x\n", year);
		
		//출생월 추출
		//				0x19991225 >>8     1     9      1     2
		//              0x00199912       0001  1001   0001  0010
		//         &    0x000000ff		 0000  0000   1111  1111
		// 				0x00000012       0000  0000   0001  0010
		int month = birthday >> 8 & 0x000000ff;
		System.out.printf("출생월 : %x\n", month);
		
		int day = birthday & 0x000000ff;
		System.out.printf("출생일 : %x\n", day);
		
		//년도 수정
		//1. 년도 끝자리 2자리 지우기
		
		// 방법1
		//   0x19991225
		// & 0xff00ffff
//		birthday = birthday & 0xff00ffff;
//		System.out.printf("방법1)생년월일 : %x\n",birthday);

		// 방법2
		//   0x19991225
		// ^ 0x00990000
		birthday = birthday ^ 0x00990000;
		System.out.printf("방법2)생년월일 : %x\n",birthday);
		
		//년도추가
		//   0x19001225     0000   0001
		// | 0x00880000     1000   0000
		birthday = birthday | 0x00880000;
		System.out.printf("생년월일 : %x\n",birthday);
	}

}
