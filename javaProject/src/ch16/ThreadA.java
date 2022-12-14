package ch16;

public class ThreadA {
	public static void main(String[] args) {
		ThreadB b = new ThreadB();
		b.start();//run 호출
		
		synchronized (b) {//ThreadB객체에 대한 동기화 설정
			System.out.println("b가 완료 될때까지 기다립니다.");
			try {
				b.wait();//main 스레드가 ThreadB에게 자신은 wait(일시정지)하겠다고 알림.
				//즉, wait()는 모니터링 락을 풀고, 다른스레드에서 notify(All)을 호출해주기를 기다린다.
				//notify가 도착하면 일시정지 상태에서 풀려나 실행을 이어나간다.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Total is :" +b.total);
		}
	}
}
class ThreadB extends Thread{
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0; i<5; i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
