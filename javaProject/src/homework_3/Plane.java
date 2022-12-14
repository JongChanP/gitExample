package homework_3;

public class Plane implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Plane SpeedUp");
	}

	@Override
	public void SpeedDown() {
		System.out.println("Plane SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Plane Handling");
	}

}
