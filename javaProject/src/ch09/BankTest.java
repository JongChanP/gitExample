package ch09;

class Bank{
	//멤버 메소드
	double getInterestRate() {
		return 0.0;
	}
}
class BadBank extends Bank{
	//get 입력 후 ctrl + space 후 파란삼각형 아이콘
	@Override
	double getInterestRate() {//메소드 오버라이딩(재정의)
		return 10.0;
	}
}
class NormalBank extends Bank{
	@Override
	double getInterestRate() {
		return 5.0;
	}
}
class GoodBank extends Bank{
	@Override
	double getInterestRate() {
		return 3.0;
	}
}
public class BankTest {

	public static void main(String[] args) {
		BadBank b1 = new BadBank();//객체생성,인스턴스화
		NormalBank b2 = new NormalBank();
		GoodBank b3 = new GoodBank();
		System.out.println("BadBank의 이자율 : "+b1.getInterestRate());
		System.out.println("NormalBank의 이자율 : "+b2.getInterestRate());
		System.out.println("GoodBank의 이자율 : "+b3.getInterestRate());
		
	}
}
