package Multi_Threading;

public class Priority_2 {
	public static void main(String[] args)
	{
		System.out.println("This is the main thread");
		Thread1 T1=new Thread1();
		T1.setPriority(10);
		T1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("MAIN THREAD");
		}
	}
}
