package ch12;

public class InnerExam3 {
	public void exec() {//멤버메소드
		class Cal{//메소드 안에서 class 선언
		int value = 0;
		public void plus() {
			value++;
			}
		}//end inner class
		Cal cal = new Cal();//3. 메소드 안에서 지역중첩클래스 생성
		cal.plus();//4. 지역중첩클래스의 멤버 메소드 호출
		System.out.println(cal.value);
	}//end method
	public static void main(String[] args) {
		//지역 중첩클래스로 접근하려면
		InnerExam3 t = new InnerExam3();//1. 외부클래스 생성
		t.exec();//2. 지역중첩클래스가 있는 외부클래스의 멤버메소드 호출
	}
}

