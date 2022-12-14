package ch03;

public class ShiftEx {

	public static void main(String[] args) {
		int a = 2;//2진수 0010
		int b = a<<2;//2진수 1000 (10진수 : 8)
		System.out.println(b);
		b = b>>2;//1000 => 0010
		System.out.println(b);

	}

}
