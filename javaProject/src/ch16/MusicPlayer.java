package ch16;

public class MusicPlayer extends Thread{
	int type;
	MusicBox musicBox;
	
	public MusicPlayer(int type, MusicBox musicBox) {
		this.type = type;
		this.musicBox = musicBox;
	}
	//Thread를 상속받앗기 때문에 run 메소드 오버라이딩
	@Override
	public void run() {
		switch (type) {//type이 무엇이냐에 따라서 MusicBox의 메소드가 다르게 호출
		case 1: musicBox.playMusicA();break;
		case 2: musicBox.playMusicB();break;
		case 3: musicBox.playMusicC();break;
		}
	}
}
