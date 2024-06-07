package Multi_Threading;

public class Test2 {
	public static void main(String[] args)
	{
		System.out.println("Main Thread!!!");
		System.out.println("This line is executed by thread: "+Thread.currentThread().getName()+"\n");
		(new Thread(new Thread_Creation1())).start();
		(new Thread_Creation2()).start();
		
	}

}
