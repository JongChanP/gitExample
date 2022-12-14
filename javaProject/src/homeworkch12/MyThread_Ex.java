package homeworkch12;

class MyThread_Ex extends Thread {
	public MyThread_Ex(String str) {
		super(str);
	}
	
	@Override
	public void run() {
		for(int i=1; i<=5; i++) {
		System.out.println(Thread.currentThread().getName()+"==>"+i);
			
		}
	}
}