package Multi_Threading;

public class ThreadYield1 {
	public static void main(String[] args)
	{
		Thread2 T1=new Thread2();
		Thread1 T2=new Thread1();
		T1.start();
		T2.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
		
	}
}
