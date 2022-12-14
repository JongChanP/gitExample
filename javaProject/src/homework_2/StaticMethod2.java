package homework_2;

public class StaticMethod2 {
	//멤버변수
	static int num = 10;//사번
	static String name="홍길동";//이름
	String email = "hong@gmail.com";//이메일
	String hp = "010-1234-5678";//hp
	String address = "서울 강남구 역삼동";//주소
	
	public static void printA() {//static member method
		System.out.println("==== printA() ====");
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		StaticMethod2 s = new StaticMethod2();
		System.out.println("이메일 : "+s.email);
		System.out.println("핸드폰 : "+s.hp);
		System.out.println("주소 : "+s.address);
		
	}
	public void printB() {
		System.out.println("==== printB() ====");
		System.out.println("사번 : "+num);
		System.out.println("이름 : "+name);
		System.out.println("이메일 : "+email);
		System.out.println("핸드폰 : "+hp);
		System.out.println("주소 : "+address);
	}
	public static void main(String[] args) {
		printA();
		StaticMethod2 a = new StaticMethod2();
		a.printB();
	}
}
