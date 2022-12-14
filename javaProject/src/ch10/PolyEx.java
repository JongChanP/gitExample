package ch10;

public class PolyEx {
	public static void main(String[] args) {
		int a = 10;
		double b = 20.1;
		char c ='A';
		String d = "hello";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("=====================");
		//최상위 클래스인 오브젝트는 모든 타입을 다 다룰수 있다.
		//만약 모든 코드를 Object로만 사용하면 프로그램이 무거워지며 속도 저하.
		//즉, 한개의 자료형으로 다양한 형태의 자료형을 처리할 수 있는 능력을 다형성
		
		Object o = "Java";
		//o=10;
		//o=22.5;
		System.out.println(o);
	}
}
