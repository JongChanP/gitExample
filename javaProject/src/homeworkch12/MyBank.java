package homeworkch12;

public class MyBank {
		public synchronized void playBankH() {
			for(int i=1; i<6; i++) {//1초 이하로 쉬면서 10번반복
				System.out.println("홍길동 님의 통장잔고는 "+(i*10)+"만원 입니다.");
				try {
					Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
			}//for
		}//platBankH
		
		public synchronized void playBankS() {
			for(int i=2; i<7; i++) {//1초 이하로 쉬면서 10번반복
				System.out.println("사임당 님의 통장잔고는 "+(i*10)+"만원 입니다.");
				try {
					Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
			}//for
		}//platBankH
				
		public synchronized void playBankL() {
			for(int i=3; i<8; i++) {//1초 이하로 쉬면서 10번반복
				System.out.println("이몽룡 님의 통장잔고는 "+(i*10)+"만원 입니다.");
				try {
					Thread.sleep(500);
					} catch(InterruptedException e) {
						e.printStackTrace();
					}
			}//for
		}//platBankH
}
