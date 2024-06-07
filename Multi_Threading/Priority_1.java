package Multi_Threading;

public class Priority_1 {
	public static void main(String[] args)
	{
		System.out.println("This is the main thread");
		System.out.println("It's priority is: "+Thread.currentThread().getPriority()+"\n\n");
		Thread1 T1=new Thread1();
		//T1.start();
		Thread.currentThread().setPriority(10);
		System.out.println("It's changed priority is: "+Thread.currentThread().getPriority()+"\n\n");
	}

}
