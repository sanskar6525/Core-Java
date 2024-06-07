package Multi_Threading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThreadCreate3 extends Thread {
	public void run()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		for(int i=0;i<10;i++)
		{
			now=LocalDateTime.now();
			String d=dtf.format(now);
			System.out.println("I am the sleeping thread at: "+d);
		}
		try {
			now=LocalDateTime.now();
			String d=dtf.format(now);
			System.out.println("Thread enters into sleep at: "+d);
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			now=LocalDateTime.now();
			String d=dtf.format(now);
			System.out.println("Thread got interrupted at: "+d);
		}
	}
}
