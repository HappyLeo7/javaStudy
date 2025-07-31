package vo;

import java.io.Serializable;

public class TextVo implements Serializable{
	Object i;
	public Object to() {
		return this.i;
	}
	
	public TextVo(Object object) {
		this.i=object;
	}
}
