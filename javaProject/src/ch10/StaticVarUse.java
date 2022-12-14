package ch10;

public class StaticVarUse {

	public static void main(String[] args) {
		//다른 클래스의 static 변수로 접근할 때는
		//클래스이름.static member   ex)StaticVar.a
		System.out.println(StaticVar.a);
		
	}

}
