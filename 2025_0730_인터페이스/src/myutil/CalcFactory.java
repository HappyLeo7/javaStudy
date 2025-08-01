package myutil;

public class CalcFactory {
	
	/**
	 * 싱글톤 null;
	 */
	static CalcFactory single =null;
	/**
	 * 싱글톤 패턴
	 * @return
	 */
	public static CalcFactory getInstance() {
		if(single==null) {
			single =new CalcFactory();
		}
		return single;
	}
	
	//private 외부에서 생성 못하도록 설정
	private CalcFactory() {
	}
	
	//??
	public BaseCalc getCalc() {
		return new BaseCalcImpl();
	}
}
