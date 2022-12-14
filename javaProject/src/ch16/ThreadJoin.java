package ch16;

public class ThreadJoin extends Thread{

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작되었습니다.");
		ThreadJoin e = new ThreadJoin();
		e.setName("thread1");//스레드 이름
		e.start();
		System.out.println(Thread.currentThread().getName()+"스레드가 종료되었습니다.");
		
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작되었습니다.");
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료되었습니다.");
	}
	
}
