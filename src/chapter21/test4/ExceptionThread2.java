package chapter21.test4;

public class ExceptionThread2 implements Runnable{
	
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run() by "+t);
		System.out.println("eh = "+t.getUncaughtExceptionHandler());
		throw new RuntimeException();
	}
}
