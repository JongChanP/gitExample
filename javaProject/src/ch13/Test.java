package ch13;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1));//올림
		System.out.println(Math.round(10.5));//반올림
		System.out.println(Math.floor(10.9));//버림
		System.out.println(Math.pow(10,3));//제곱
		System.out.println(Math.pow(2, 3));
		Random rand=new Random();
		System.out.println("정수값 : " + rand.nextInt(100));//100이하의 랜덤정수
		System.out.println("정수값 : " + rand.nextDouble());//1이하의 랜덤실수
		
		int a = 10;
		
		Integer b=20;
		Integer c = new Integer(30);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c.intValue());
	
	
	}
}
