package Multi_Threading;

public class ThreadCreate extends Thread
	{
	static Thread m;
	public void run()
	{
		try { 
			m.join();
		}
		catch(InterruptedException e){}
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread");
		}
	}
	}
