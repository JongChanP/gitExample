package ch10;

public class OverloadEx {
	//over load :메소드 이름은 같지만 자료형 또는 매개변수 개수가 달라야한다.
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		o.putData("hello");
		o.putData(5);
		o.putData(3.5);
	}
}
