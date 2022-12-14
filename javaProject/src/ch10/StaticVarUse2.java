package ch10;

public class StaticVarUse2 {

	public static void main(String[] args) {
		//static = > 클래스이름.staticmember 로 접근가능 객체생성필요없음
		System.out.println(StaticVar2.total);
		
		StaticVar2 car1 =new StaticVar2("쏘나타");//객체생성
		System.out.println(StaticVar2.total);
		StaticVar2 car2 =new StaticVar2("모닝");//객체생성
		System.out.println(StaticVar2.total);
		StaticVar2 car3 =new StaticVar2("아반떼");//객체생성
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);
	}
}
