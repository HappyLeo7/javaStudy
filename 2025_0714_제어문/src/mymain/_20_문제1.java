package mymain;

import java.util.Scanner;

public class _20_문제1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String mbti = "";
		String result = "";

		// E I , S N , F T, J P

		System.out.print("내향(1),외향(2)");
		int e_i = scanner.nextInt();
		if (e_i == 1) {
			mbti += "I";
		} else {
			mbti += "E";
		}
		System.out.print("--------------------------------------------\n");
		System.out.print("사과하면 생각나는것 \n(1)맛있다, 빨갛다, 아삭아삭\n(2)빨가면 사과 사과는 맛있어 맛있는면 바나나, 중력(사과를 통해서 중력이발견됐기 때문에");
		int s_n = scanner.nextInt();
		if (s_n == 1) {
			mbti += "S";
		} else {
			mbti += "N";
		}

		System.out.print("--------------------------------------------\n");
		System.out.print("친구가 열심히 돈모아서 최신형 아이패드를 샀다 당신의 반응은? \n (1) 우와~ 좋겠다 고생했어~ (2)오 신형 기능어때? 좋아?");
		int f_t = scanner.nextInt();
		if (f_t == 1) {
			mbti += "F";
		} else {
			mbti += "T";
		}

		System.out.print("--------------------------------------------\n");
		System.out.print("당신은 여행을 계획 한것이 틀어지면 스트레스를 받으시나요? \n(1) 예  (2) 아니요");
		int j_p = scanner.nextInt();
		if (j_p == 1) {
			mbti += "J";
		} else {
			mbti += "P";
		}
		System.out.print("--------------------------------------------\n");

		System.out.printf("당신의 MBTI는 [%s]입니다\n", mbti);
		System.out.print("--------------------------------------------\n");

		char mbti1 = mbti.charAt(0);
		char mbti2 = mbti.charAt(1);
		char mbti3 = mbti.charAt(2);
		char mbti4 = mbti.charAt(3);

		// E I , S N , F T, J P
		if (mbti1 == 'E') {
			result += "E는 외향형 입니다.\n";
		} else {
			if (mbti1 == 'I') {
				result += "I는 내향형 입니다.\n";
			}
		}

		if (mbti2 == 'S') {
			result += "S는 감각형 입니다.\n";
		} else {
			if (mbti2 == 'N') {
				result += "N은 직관형 입니다.\n";

			}
		}

		if (mbti3 == 'F') {
			result += "F은 감각형 입니다.\n";
		} else {
			if (mbti3 == 'T') {

				result += "T은 사고형 입니다.\n";
			}
		}
		if (mbti4 == 'P') {
			result += "P은 인식형 입니다.\n";

		} else {
			if (mbti4 == 'J') {
				result =result+ "J은 판단형 입니다.\n";

			}
		}

		System.out.println(result);
		
		switch(mbti) {
		case "ESFP": result="연예인형";break;
		case "ESFJ": result="탐구";break;
		case "ESTP": result="인형";break;
		case "ESTJ": result="예인형";break;
		case "ENFP": result="예인형";break;
		case "ENFJ": result="예인형";break;
		
		}
		System.out.println(mbti +"는 "+result+"입니다");
		

	} // main_end
}
