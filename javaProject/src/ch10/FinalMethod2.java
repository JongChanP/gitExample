package ch10;

class T {
	private int num = 10;
	public final void print() {//오버라이딩 불가능
		System.out.println(num);
	}
}
public class FinalMethod2 extends T{
	int num = 100;
	
	public static void main(String[] args) {
		//상속관계가 만들어 졌을때는 자식클래스를 객체생성하면 부모클래스 자동생성
		FinalMethod2 f = new FinalMethod2();
		f.print();
	}
}
