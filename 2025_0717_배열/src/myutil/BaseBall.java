package myutil;

import java.util.Random;

public class BaseBall {
	int[] com_no = new int[3];
	int[] user_no;
	public int end=1;
	Random random = new Random();
	
	public void setUser_no(int[] user_no) {
		this.user_no = user_no;

	}
	

	public String check1() {
//		System.out.printf("%d,%d,%d\n",com_no[0],com_no[1],com_no[2]);
		// user_no 와 com_no체크해서
		// 스트라이크 볼 아웃 정보 반환
		String check = "";
		int bCheck1=(user_no[0]==com_no[0])?1:0;
//		System.out.println(bCheck1);
		int bCheck2=(user_no[1]==com_no[1])?1:0;
//		System.out.println(bCheck2);
		int bCheck3=(user_no[2]==com_no[2])?1:0;
//		System.out.println(bCheck3);
		int int_check4=0;
		if(bCheck1+bCheck2+bCheck3==3){
//			check = String.format("[0]%b,[1]%b,[2]%b : 스트라이크!!\n", user_no[0] == com_no[0], user_no[1] == com_no[1],user_no[2] == com_no[2]);
			check += "3스트라이크 상품 받아가세요";	
			this.end=0;
			}else
		if(bCheck1+bCheck2+bCheck3==2){
			check += "2스트라이크";	
			}else if(bCheck1+bCheck2+bCheck3==1){
//		check = String.format("[0]%b,[1]%b,[2]%b : 스트라이크!!\n", user_no[0] == com_no[0], user_no[1] == com_no[1],user_no[2] == com_no[2]);
		check += "1스트라이크";	
		}
		if(true){
			for(int i =0 ;i<3;i++) {
				for(int k=0;k<3;k++) {
					if(i==k) {
//					System.out.println("no:"+no);
						
					}else{
						
					int no=(user_no[i]==com_no[k])?1:0;
					int_check4+=no;
//					System.out.println("int_check4:"+int_check4);
					}
				}
				
			}
			 switch(int_check4) {
			 case 0 :return check+="0볼"; 
			 case 1 :return check+="1볼"; 
			 case 2 :return check+="2볼"; 
			 case 3 :return check+="3볼"; 
			 }
		}
		
		return check;
	}//end : check1
	
	public int check2() {
		int strike = 0;
		int ball = 0;
		for(int i =0;i<3;i++) {
			for(int k=0;k<3;k++) {
				//위치와 값이 일치하면 스트라이크
				if(i==k&&com_no[i]==user_no[k])strike++;
				//값만 일치하면 볼
				else if(com_no[i]==user_no[k])ball++;
			}
		}
		
		//strike ball이 없으면 아웃
		if(strike==0&&ball==0) return 1;
		
		System.out.print("com_no : ");
		for(int n:com_no) {
			System.out.print(n+" ");
		}
		System.out.println();
		
		System.out.printf("%d strike %d ball\n",strike,ball);
		
		return 0;
	}//end check2
	

	public void make_no() {

		OUT_FOR: for (int i = 0; i < com_no.length; i++) {
			int su = random.nextInt(9) + 1;

			// 중복수 체크
			for (int k = 0; k < i; k++) {
				if (su == com_no[k]) {
					i--;
					continue OUT_FOR;
				}
			}
			com_no[i] = su;
		}

	}
}
