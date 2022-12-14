package ch12;

public class TestOuter {
	//멤버변수
	private int data=30;//TestOuter 의 멤버변수
	class Inner{//중첩클래스
		void msg() {//Inner의 멤버 메소드
			System.out.println("data is "+data);
			//중첩클래스에서는 외부클래스의 private 멤버변수도 쓸수 있다.
		}
	}
	public static void main(String[] args) {
		TestOuter obj = new TestOuter();//1.외부객체생성
		TestOuter.Inner in = obj.new Inner();//2.내부객체생성
		//외부클래스.내부클래스 참조변수 = 외부객체.new 내부클래스
		in.msg();
	}
}
