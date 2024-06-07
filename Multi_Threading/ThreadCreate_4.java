package Multi_Threading;

public class ThreadCreate_4 extends Thread {
	String n;
	Message m;
	public ThreadCreate_4(Message w, String q)
	{
		m=w;
		n=q;
	}
	public void run()
	{
		m.display(n);
	}
}
