package ch10;

public class Test {
	static int a;//static member
	int b;//nonstatic member
	void print() {//nonstatic member 메소드
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) {
		System.out.println(a);//static member라서 객체생성 필요없음
		Test t = new Test();//객체 생성
		System.out.println(t.b);//객체생성 필요
		t.print();
		//t=null;//객체의 주소값을 초기화(주소값을 잃어버린다.)
	}
	
}
