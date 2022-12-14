package ch13;

public class ToStr {//항상 extends Object 생략되어있음
	public static void main(String[] args) {
		Object obj = new Object();
		obj=new Integer(20);//좌 : 부모, 우 : 자식 (다형성)
		//참조변수에는 원래 주소값이 들어가지만 jdk1.5부터는 value가 들어갈
		//수 있도록 내부처리(intValue()등의 호출)하도록했다(AutoBoxing처리)
		//obj=20;
		System.out.println(obj);//객체 > 일반 Auto UnBoxing처리
		obj=new Double(20.5);
		//obj=20.5
		System.out.println(obj);
		//obj=new String("hello");
		obj="hello";
		System.out.println(obj);
	}
}
