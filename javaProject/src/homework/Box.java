package homework;

public class Box {

	public static void main(String[] args) {
		double length, breadth, area, perimeter;
		length = 10.0;
		breadth = 5.0;
		
		area = length * breadth;
		perimeter =  2 * (length + breadth);
		System.out.println("직사각형의 넓이 : " + area);
		System.out.println("직사각형의 둘레 : " + perimeter);

	}

}
