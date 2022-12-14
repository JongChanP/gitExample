package homeworkch12;

public class MyThread_Im_Use {
	public static void main(String[] args) {
		MyThread_Im i1=new MyThread_Im();
		MyThread_Im i2=new MyThread_Im();
		
		Thread a1=new Thread(i1, "스레드1");
		Thread a2=new Thread(i2, "스레드2");
		
		a1.setPriority(Thread.MIN_PRIORITY);
		a2.setPriority(Thread.MAX_PRIORITY);
		a2.start();
		a1.getPriority();
		a1.getPriority();
		a1.start();
	}
}
