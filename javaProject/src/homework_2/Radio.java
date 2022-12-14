package homework_2;

public class Radio {
	//멤버(전역,필드)변수
		String name;
		double channel;
		int volume; 
		boolean onoff;
		void print() {
			System.out.println("["+name+" 라디오]");
			while(onoff == true) {
				System.out.println("라디오가 켜져있습니다.");
				break;
			}while(onoff == false) {
				System.out.println("라디오가 꺼져있습니다.");			
				break;
			}System.out.println("현재 채널은 "+channel+" 입니다.");
		System.out.println("볼륨은 "+volume+" 입니다.");
		}
}

