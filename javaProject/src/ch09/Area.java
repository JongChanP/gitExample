package ch09;

public class Area {
//멤버변수
	private int width;//int는 기본 0 으로 초기화
	private int length;
	//생성자
	public Area() {	}
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public int getWidth() {	return width; }
	public void setWidth(int width) {
		this.width = width;
	}
	public int getLength() { return length;	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getArea() {
		return width*length;
	}
}
