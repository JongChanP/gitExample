package ch11;

public class AbstractExtends extends AbstractClass {

	//오버라이딩은 부모쪽에 잇는 미완성된 메소드를 구현
	@Override
	void method1() {
		System.out.println("추상 메소드를 완성한 메소드");
	}
	public static void main(String[] args) {
		//AbstractClass a = new AbstractClass();
		//주희점 : 추상메소드가 있는 추상클래스, 인터페이스 이건 new를 통해서 객체생성 불가능
		//추상 클래스는 인스턴스를 생성할 수 없다.(객체 생성 불가능)
		AbstractExtends ex= new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}
