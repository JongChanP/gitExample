package ch12;

public class LocalOuter {
	private int data=30;
	void display() {//LocalOuter의 멤버메소드
		class LocalInner{//지역내부클래스(메소드안에서 선언)
			void msg() {//LocalInner의 멤버메소드
				System.out.println(data);
			}
		}//end inner class
		LocalInner li=new LocalInner();//내부객체생성
		li.msg();
	}
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display();
	}
}
