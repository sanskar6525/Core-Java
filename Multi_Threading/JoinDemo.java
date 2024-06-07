package Multi_Threading;

class JoinDemo
{
	public static void main(String[] args) throws InterruptedException
	{
		Joining t1=new Joining();
		t1.start();
		t1.join();
		for(int i =0;i<10;i++)
		{
			System.out.println("Main Class !!");
		}
	}
}
