package ch07;

import ch06.ModiEx;

public class ModiExUse extends ModiEx {
	//상속관계를 자세히 다룰 예정
	//상속관계에 있어서 부모클래스가 아닌 자식클래스를 인스턴스화 해줘야함.
	//public class 자식클래스 extends 부모클래스
	public static void main(String[] args) {
		ModiExUse me = new ModiExUse();//생성 (인스턴스화)
		System.out.println(me.name);
	}

}
