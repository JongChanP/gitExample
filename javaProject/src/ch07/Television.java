package ch07;

public class Television {
	//멤버(전역,필드)변수
	int channel; //채널 7 | 다른메모리에 9
	int volume; //볼륨 9 | 다른메모리에 12
	boolean onoff; //전원상태 true | false
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+volume+"입니다.");
	}
	int getChannel() {//public 생략하면 default 인데 앞에 써지진 않고 패키지내 공유가능
		return channel;
	}
	void setChannel(int ch) {
		channel = ch;
	}
}