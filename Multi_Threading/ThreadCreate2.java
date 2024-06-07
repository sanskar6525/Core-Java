package Multi_Threading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ThreadCreate2 extends Thread {
	public void run()
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		try {
			for(int i=0;i<5;i++)
			{
				now=LocalDateTime.now();
				String d=dtf.format(now);
				System.out.println("I am the sleeping thread at: "+d);
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			now=LocalDateTime.now();
			String d=dtf.format(now);
			System.out.println("I got interrupted at: "+d);
		}
	}
}
