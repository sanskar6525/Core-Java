package Multi_Threading;

public class Synchronized2 {
	public static void main(String[] args)
	{
		Message_2 m1=new Message_2();
		ThreadCreate_5 t1=new ThreadCreate_5(m1,"Rahul"); //Thread 1
		t1.start();
		
		ThreadCreate_5 t2=new ThreadCreate_5(m1,"Manish"); //Thread 2
		t2.start();
		
	}
}
