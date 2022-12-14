package ch13;

//import java.lang.*;//가 생략되어져 있다.
public class Exam { //extends Object가 생략되어 있음
	public static void main(String[] args) {
		String a="hello";//String Pool이라는 영역에 값이 올라간다.
		//String의 전용 객체주소 확인용 메소드 identityHashCode()
		System.out.println(System.identityHashCode(a));
		String b="hello";
		System.out.println(System.identityHashCode(b));
		System.out.println(a==b);//결과:true(a와 b의 주소가 같다)
		
		String c=new String("hello");//new하면 새로운 주소
		System.out.println(System.identityHashCode(c));
		String d=new String("hello");//new하면 새로운 주소
		System.out.println(System.identityHashCode(d));
		System.out.println(c==d);//결과:false(a와 b의 주소가 틀리다)
		System.out.println(c.equals(d));//결과:true,(내용을 비교)
	}
}
