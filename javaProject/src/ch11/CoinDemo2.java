package ch11;

public class CoinDemo2 implements Coin {
	public static void main(String[] args) {
		//인터페이스르 상속받은 경우는 바로 멤버 접근이 가능하다.
		System.out.println("Dime은 "+ DIME+"센트입니다.");
	}
}
