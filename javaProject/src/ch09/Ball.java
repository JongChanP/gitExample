package ch09;

public class Ball extends Circle{
	private String color;//Ball 클래스의 멤버
	public Ball(String color) {
		this.color=color;
	}
	public void findColor() {
		System.out.println(color + "공이다.");
	}
	public void findVolume() {
		System.out.println("부피 구하기");
	}
	public Ball() {
		
	}
}
