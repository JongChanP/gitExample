package ch10;

class A2 {
//final class A2{ fianl로 지정한 class는 상속이 안된다.
	void print() {
	//final void print() {//final로 지정한 메소드는 오버라이딩이 안된다.
		System.out.println("a");
	}
}
class B2 extends A2{
	@Override
	void print() {
		super.print();
		System.out.println("b");
	}
}


public class FinalMethod {
	public static void main(String[] args) {
		B2 b=new B2();
		b.print();
	}
}
