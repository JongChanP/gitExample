package homework_2;

public class Person2 {
	private String name;
	private int age;
	private double height;
	private String email;
	private String address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void print() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("이메일 : "+email);
		System.out.println("주소 : "+address);
	}
}
