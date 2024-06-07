package Multi_Threading;

public class ProConsExample {
	public static void main(String[] args)
	{
		DataHolder drop = new DataHolder();
	
        new Producer(drop).start();
        new Consumer(drop).start();
	}
}
