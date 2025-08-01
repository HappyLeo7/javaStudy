package myutil;

public class TV implements RemoteCon{

	int volume =10;
	int channel = 0;
	
	boolean bOnOff= false; // 켜져있니? 꺼져있니?
	boolean bSoundOff = false; // 음소거 상태이니?
	
	@Override
	public void volumeUp() {
		volume++;
		if(volume>Volume.MAX) {
			volume=Volume.MAX;
		}
		display();		
	}

	@Override
	public void volumeDown() {
		volume--;
		if(volume<Volume.MIN) {
			volume=Volume.MIN;
		}
		display();		
	}

	@Override
	public void volumeZero() {
		bSoundOff=!bSoundOff;
		display();
	}

	@Override
	public void channelUp() {
		channel++;
		if(channel>Channel.MAX) {
			channel=Channel.MIN;
		}
		display();
	}

	@Override
	public void channelDown() {
		channel--;
		if(channel<Channel.MIN) {
			channel=Channel.MAX;
		}
		display();
		
	}

	@Override
	public void setChanel(int ch) {
		//  1  >   0  1000 > 999
		if(ch< 0||ch> 999) {
			System.out.printf("%d번 채널은 유효하지 않는 채널입니다.",ch);
			return;
		}
		channel=ch;
		display();
	}

	@Override
	public void onOff() {
		// Toggle 기능 : true <-> false
		bOnOff= !bOnOff;
		
		display();
	}

	private void display() {
		System.out.println("----------[TV]----------");
		if(bOnOff==false) {
			System.out.println("상태 : 꺼짐");
			return;
		}
		//켜졌을때 상태
		System.out.printf("채널 : %d\n",channel);
		if(bSoundOff) {
			System.out.println("소리 : 음소거");
		}else {
			System.out.printf("소리 : %d\n",volume);
		}
	}

}
