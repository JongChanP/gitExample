package ch11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("원 그리기 중심 x 의 좌표 값 :" +x);
		System.out.println("원 그리기 중심 y 의 좌표 값 :" +y);
	}

}
