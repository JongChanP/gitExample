package ch11;

public interface RemoteControllable extends Controllable {
	//인터페이스 끼리는 extends 로 상속받는다.
	void remoteOn();
	void remoteOff();

}
