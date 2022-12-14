package ch10;

class Test11{
	public void print() {
		System.out.println("test11");
	}
}
class Test22 extends Test11{
	@Override
	public void print() {//오버라이딩:상속과 관련이 있다.
		System.out.println("test22");
		super.print();//부모 메소드 호출
	}
}
public class OverrideEx {
	public static void main(String[] args) {
		Test22 t = new Test22();
		t.print();
	}
}
