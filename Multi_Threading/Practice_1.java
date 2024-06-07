package Multi_Threading;

public class Practice_1 {
	public static void main(String[] args)
	{
		System.out.println("Main Thread and it's name is "+Thread.currentThread().getName());
		
		ThreadA T=new ThreadA();
		T.start();
	}

}
