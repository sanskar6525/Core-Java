package Multi_Threading;

public class Thread1 extends Thread{
	public void run()
	{
		
		/*Thread.currentThread().setName("ChildThread1");
		System.out.println("\n\nThis is the child thread and it's name is: "+Thread.currentThread().getName());
		System.out.println("It's priority is: "+Thread.currentThread().getPriority());*/
		for(int i=0;i<10;i++)
		{
			System.out.println("CHILD THREAD 1");
		}
	}
}
