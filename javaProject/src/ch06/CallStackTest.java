package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	}//프로그램 끝

	public static void firstMethod() {
		secondMethod();
	}

	public static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
