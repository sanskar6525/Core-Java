package Multi_Threading;

public class ThreadB implements Runnable {
	public void run()
	{
		System.out.println("CHild Thread and it's name is "+Thread.currentThread().getName());
	}

}
