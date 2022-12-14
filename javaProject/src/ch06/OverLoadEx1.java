package ch06;

public class OverLoadEx1 {

	public static void main(String[] args) {
		print(10.5);
		print("hello");
		print(100);
		print("Hi","Java");
	}
	//리턴타입과 오버로딩은 무관하다.
	//오버로딩은 한개의 함수안에 여러 타입을 적용하는 것
	static void print(double a) {//a=10.5
		System.out.println(a);
	}	
	private static void print(String b) {//b="hello"
		System.out.println(b);
	}
	static void print(int c) {//c=100
		System.out.println(c);
	}	
	static void print(String d, String e) {//d="Hi",e="Java"
		System.out.println(d);
		System.out.println(e);
	}


}
