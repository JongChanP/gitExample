package ch06;

public class ParamEx {
	//매개변수가 2개 이상인 경우
	static int puls(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int multi(int a, int b) {
		return a*b;
	}
	static int divide(int a, int b) {
		return a/b;
	}

	public static void main(String[] args) {
		int n;
		n=puls(10,20);
		System.out.println("plus:"+n);
		n=minus(10,20);
		System.out.println("minus:"+n);
		n=multi(10,20);
		System.out.println("multi:"+n);
		n=divide(10,20);
		System.out.println("divide:"+n);
	}		
}
