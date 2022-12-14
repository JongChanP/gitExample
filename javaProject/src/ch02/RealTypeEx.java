package ch02;

public class RealTypeEx {

	public static void main(String[] args) {
		double d = 0.1234d;//double도 숫자 뒤에는 D or d 를 써야되지만 생략가능
		double e = 1234E-4d;//1234E-4 = 1234x(10)-4이므로 0.1234 와 동일
		float f = 0.1234f;//float형 만큼은 숫자 뒤에 F or f 를 꼭 명시해야 한다.
		double w = .1234d; // .1234는 0.1234이다.
		
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(w);

	}

}
