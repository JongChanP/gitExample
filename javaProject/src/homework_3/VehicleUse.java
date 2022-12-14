package homework_3;

public class VehicleUse {
	public static void main(String[] args) {
		Vehicle a = new Car();
		a.speedUp();
		a.SpeedDown();
		a.handle();
		
		a = new Plane();
		a.speedUp();
		a.SpeedDown();
		a.handle();
		
		a = new Boat();
		a.speedUp();
		a.SpeedDown();
		a.handle();
	}
}
