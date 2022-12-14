package homeworkch12;

public class MyThread_Ex_Use {	
	public static void main(String[] args) {
		MyThread_Ex t1=new MyThread_Ex("");
		MyThread_Ex t2=new MyThread_Ex("");
		
		Thread b1=new Thread(t1, "스레드1");
		Thread b2=new Thread(t2, "스레드2");	
		b1.start();
		b1.setPriority(Thread.MAX_PRIORITY);
		b2.setPriority(Thread.MIN_PRIORITY);
		b2.start();
	}
}