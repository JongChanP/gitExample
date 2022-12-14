package ch12;

public class OuterClass {
	private static int x=10;
	class Inner{//내부클래스(중첩,인스턴스 클래스)
		int getx() {
			return x;
		}
	}
	public static void main(String[] args) {
		System.out.println(x);
		OuterClass e = new OuterClass();
		OuterClass.Inner in = e.new Inner();
		System.out.println(in.getx());
	}
}
