package ch10;

//static을 사용하면 메모리에 바로 로딩
//nontatic => 객체 생성 후 로딩 가능
public class A {
	//멤버변수
	String name = "kim";//nonstatic member
	static int n = 20;//static member
	//멤버 메소드
	public void print() {
		System.out.println(name);
		System.out.println(n);
		
	}
	public static void main(String[] args) {
		//지역 변수
		int a = 10;
		double b = 20.5;
		System.out.println(a);
		System.out.println(b);
		System.out.println(n);

		A aa = new A();
		System.out.println(aa.name);
		//non static member 는 반드시 객체 생성 후 사용 가능하다
	}
}
