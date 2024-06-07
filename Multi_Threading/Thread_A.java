package Multi_Threading;

public class Thread_A extends Thread {
	int total=0;
	public void run()
	{
		synchronized(this)
		{
			
			for(int i=0;i<=100;i++)
			{
				total=total+i; //Updating Thread
			}
			System.out.println("Child thread"
				+" trying to call notify method");
			this.notify();
		}
		
	}

}
