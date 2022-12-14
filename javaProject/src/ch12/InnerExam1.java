package ch12;

public class InnerExam1 {
	class Cal{
		int value=0;
		public void plus() {
			value++;
		}
	}//end inner class
	
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1();//외부객체생성
		//외부클래스이름.내부클래스이름 참조변수 = 외부참조변수.new 내부클래스 생성자();
		InnerExam1.Cal cal = t.new Cal();//내부객체 생성
		cal.plus();
		System.out.println(cal.value);
	}
}
