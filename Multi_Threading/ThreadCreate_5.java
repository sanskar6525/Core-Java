package Multi_Threading;

public class ThreadCreate_5 extends Thread {
	String n;
	Message_2 m;
	public ThreadCreate_5(Message_2 w, String q)
	{
		m=w;
		n=q;
	}
	public void run()
	{
		m.display(n);
	}
}
