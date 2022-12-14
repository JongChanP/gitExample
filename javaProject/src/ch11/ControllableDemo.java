package ch11;

public class ControllableDemo {
	public static void main(String[] args) {
		Tv tv=new Tv();
		tv.turnOn();
		tv.turnOff();
		tv.remoteOn();
		tv.remoteOff();
		tv.repair();
		Controllable.reset();
		//static 멤버일때는 클래스이름.메소드 로 접근해야함
		
		Compter com = new Compter();
		com.turnOn();
		com.turnOff();
		com.repair();
		Controllable.reset();
	}
}
