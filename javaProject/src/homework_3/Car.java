package homework_3;

public class Car implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Car SpeedUp");
	}

	@Override
	public void SpeedDown() {
		System.out.println("Car SpeedDown");
	}

	@Override
	public void handle() {
		System.out.println("Car Handling");
	}
}
