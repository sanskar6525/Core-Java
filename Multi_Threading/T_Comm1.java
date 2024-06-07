package Multi_Threading;

public class T_Comm1 {
	public static void main(String[] args) throws InterruptedException
	{
		Thread_A T=new Thread_A();
		T.start();
		synchronized(T)
		{
			System.out.println("Main thread "
				+"trying to call wait method");
			T.wait();
		}
		
		System.out.println(T.total); 
		
	}

}
