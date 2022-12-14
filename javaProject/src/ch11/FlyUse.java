package ch11;

public class FlyUse {
	public static void main(String[] args) {
		System.out.println("== 일반 기법 ==");
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		
		System.out.println("== 다형성 기법 ==");
		//실무 에서는
		Flyer f = new Bird();//좌:부모클래스, 우:자식클래스 => 다형성기법
		f.takeOff();
		f.fly();
		f.land();
		
		f=new Airplane();
		f.takeOff();
		f.fly();
		f.land();
	}
}
