package ch09;

class Animal{
	public Animal(String s) {
	System.out.println("동물 : " +s);
	}
}
class Mammal extends Animal{
	public Mammal() {//기본생성자
		super("원숭이");//부모 클래스 생성자 호출
		System.out.println("포유류 : 원숭이");
	}
	public Mammal(String s) {//매개변수가 있는 생성자
		super(s);//부모 클래스 생성자 호출
		System.out.println("포유류 :"+s);
	}
}
public class AnimalDemo {

	public static void main(String[] args) {
		Mammal ape = new Mammal();//객체생성 및 기본생성자 호출
		Mammal lion = new Mammal("사자");//객체생성 및 매개변수가 있는 생성자 호출
	}
}

