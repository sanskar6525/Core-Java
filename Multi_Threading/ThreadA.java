package Multi_Threading;

public class ThreadA extends Thread {
	public void run()
	{
		System.out.println("CHild Thread and it's name is "+Thread.currentThread().getName());
	}
}
