package itutil;

public class Funtion {
	//필드 접근제한자 타입 변수
   private String sName;
   private int iNum;
   private boolean gender;
   
   //기본생성자
   //객체생성시 자동으로 1회 호출
   //형식 : 클래스명()
   public Funtion() {
	   
   }
   
   public int getiNum() {
	return iNum;
}

public void setiNum(int iNum) {
	this.iNum = iNum;
}

//가변인자를 받아오는 생성자
   /**
 * @param sName
 */
public Funtion(String sName) {
	   
   }
   
   //main 기준으로 클래스에 데이터 저장할때
//   public void setINum(int iNum) {
//	   this.iNum=iNum;
//   }
   
   //main 기준으로 클래스에서 데이터를 불러올때
   /**
 * @return ㅁㄴㅇㄹ
 */
public int getsName() {
	   this.iNum= 100;
	   return this.iNum;
   }
   
   /**
 * 안녕하세요 이건 이런겁니다
 */
public void display() {
	   System.out.print(this.iNum);
   }
   
   public int a; //퍼블릭
   protected int b; // 프러텍티드
   private int d;//프라이빗
    int c;//디펄트 default
   
    protected int zz;
    private int xx;
   
   
   
}
