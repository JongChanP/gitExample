package ch13;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;//기본자료형
		Object obj= 20;//좌:부 = 우:자(다형성), 참조자료형
		
		a = (Integer)obj;//정상적인 형변환
		a = (int)obj;//원래는 obj가 객체형이기 때문에 기본자료형(int)로하면 안된다.
		//하지만 최신버전에서는 허용
		System.out.println(a);
		//Object 배열 : 다양한 자료형 사용가능
		
		Object[] obj2 = {100,100,5,true,"hello","A"};
		//사실은 각 데이터가 Object 객체(Integer,Double,Boolean...)가 되어버림
		//그래서 메모리 낭비가 심하다. 이렇게 쓰는일은 없다.대신 컬렉션처리
		//(ArrayList등..)를 사용하면 보완할 수 있다.
		for(Object o : obj2) {//for each,향상된 for,확장 for
			System.out.println(o);
		}
	}
}
