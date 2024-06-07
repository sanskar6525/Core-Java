package Multi_Threading;

public class Practice2 {
	public static void main(String[] args)
	{
		System.out.println("Main Thread and it's name is "+Thread.currentThread().getName());
		
		
		Thread T=new Thread(new ThreadB());
		T.start();
	}

}

