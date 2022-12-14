package homeworkch12;

public class MemberOuter {
	private int num = 1;
	private String name = "홍길동";
	private String email = "hong@gmail.com";
	class MemberInner{
		void print() {
			System.out.println("------------------------");
			System.out.println("고객번호 : "+num);
			System.out.println("이름 : "+name);
			System.out.println("이메일 : "+email);
			System.out.println("------------------------");
			}
	}
		public static void main(String[] args) {
			MemberOuter obj = new MemberOuter();//1.외부객체생성
			MemberOuter.MemberInner in = obj.new MemberInner();//2.내부객체생성
			//외부클래스.내부클래스 참조변수 = 외부객체.new 내부클래스
			in.print();
		}
}

