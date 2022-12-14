package ch07;
//한개의 파일에 2개이상의 class 파일을 작성시에는 파일명을 public class이름으로
//저장하고 나머지 class는 default처리
class Phone{
	String model;
	int value;
	void print() {
		System.out.println(value +"만원 짜리 "+model+" 스마트폰");
	}
}
public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();//객체생성
		myPhone.model="갤럭시 22";
		myPhone.value=100;
		myPhone.print();
	
		Phone yourPhone = new Phone();//객체생성
		yourPhone.model="iPhone 13";
		yourPhone.value=150;
		yourPhone.print();
	}
}
