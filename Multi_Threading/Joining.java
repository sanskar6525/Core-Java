package Multi_Threading;

public class Joining extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Child Thread !");
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{}
		}
	}
}
