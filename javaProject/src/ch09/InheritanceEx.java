package ch09;

public class InheritanceEx {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("빨강색");//객체생성과 동시에 매개변수가 있는 생성자 호출
		System.out.println("원 : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("공 : ");
		c2.findRadius();//Circle 멤버
		c2.findColor();//ball 멤버
		c2.findArea();//Circle 멤버
		c2.findVolume();//ball 멤버
		
		Circle c3 = new Circle(4);//생성자는 상속의 대상이 아니라 고유한 객체로서 사용되어진다.
		Ball c4 = new Ball();
	
	}
	

}
