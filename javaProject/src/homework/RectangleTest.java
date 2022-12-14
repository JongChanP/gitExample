package homework;

import java.util.Scanner;

public class RectangleTest {

	public static void main(String[] args) {
		Scanner rectangle = new Scanner(System.in);
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		int leghth = rectangle.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		int breadth = rectangle.nextInt();
		
		double area = leghth * breadth;
		System.out.println("직사각형의 넓이는 " +area+ "입니다.");
		rectangle.close();
		
	}

}
