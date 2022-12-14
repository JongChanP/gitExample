package ch12;

public class StaticOuter2 {
	static int data=30;
	int data2=50;
	static class StaticInner2{
		void msg() {
			System.out.println("data is"+data);//static멤버는 자유롭게 공유
			//System.out.println("data is"+data2);//non static 멤버는 사용불가능
		}
	}
	public static void main(String[] args) {
		StaticOuter2.StaticInner2 in = new StaticOuter2.StaticInner2();
		//외부클래스.내부클래스 참조변수 = new 외부클래스.내부클래스
		in.msg();
	}
}
