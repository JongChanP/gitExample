package ch07;

public class Person {
	//멤버(전역,필드) 변수의 데이터는 중요하기 때문에 캡슐화를 해야한다.
	private String name;
	private int age;
	private double height;
	//public으로 처리된 메소드를 활용하여 private를 
	//getter , setter 활용
	public String getName() {//데이터를 get
		return name;
	}
	public void setName(String name) {//데이터를 set
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age < 0 || age > 150) {
			System.out.println("입력값이 정확하지 않습니다.");
		}else {
		this.age = age;
		}
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void print() {
		System.out.println("이름:"+name+", 나이:"+age+", 키:"+height);
	}
}
