package Multi_Threading;

public class Thread2 extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread 2");
			Thread.yield();
		}
	}

}
