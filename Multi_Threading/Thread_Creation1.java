package Multi_Threading;

//Defining a thread
public class Thread_Creation1 implements Runnable  {
	public void run()
	{
		//JOB OF THE THREAD
		System.out.println("Child Thread!!!");
		System.out.println("This line is executed by thread: "+Thread.currentThread().getName()+"\n");
	}
}
