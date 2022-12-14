package ch11;

public abstract class Shape {
	int x, y;
	public void move(int x , int y) {
		this.x = x;
		this.y = y;
	}
	public abstract void draw();//바디가 없는( "{}" 없는 ) 메소드
}
