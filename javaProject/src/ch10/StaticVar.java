package ch10;

public class StaticVar {
	static int a = 10;
	int b = 20;//nonstatic
	public static void main(String[] args) {
		System.out.println(StaticVar.a);//클래스이름.static member 변수
		StaticVar s = new StaticVar();
		System.out.println(s.b);
		
	}
}
