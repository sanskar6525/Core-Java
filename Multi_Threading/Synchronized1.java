package Multi_Threading;

public class Synchronized1 {
	public static void main(String[] args)
	{
		Message m1=new Message();
		ThreadCreate_4 t1=new ThreadCreate_4(m1,"Rahul"); //Thread 1
		t1.start();
		
		ThreadCreate_4 t2=new ThreadCreate_4(m1,"Manish"); //Thread 2
		t2.start();
		
	}

}
