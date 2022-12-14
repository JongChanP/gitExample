package homeworkch12;

public class BankPlayer extends Thread{
	int type;
	MyBank myBank;
	
	public BankPlayer(int type, MyBank myBank) {
		this.type = type;
		this.myBank = myBank;
	}
	//Thread를 상속받앗기 때문에 run 메소드 오버라이딩
	@Override
	public void run() {
		switch (type) {
		case 1: myBank.playBankH();break;
		case 2: myBank.playBankS();break;
		case 3: myBank.playBankL();break;
		}
	}
}
