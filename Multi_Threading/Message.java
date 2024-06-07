package Multi_Threading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message  {
	public synchronized void  display(String name) //Synchronized Method
	{
		long startTime = System.currentTimeMillis();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		for(int i=0;i<5;i++)
		{
			now=LocalDateTime.now();
			System.out.print("Good Morning ("+dtf.format(now)+") : ");
			try {
				Thread.sleep(4000);
				now=LocalDateTime.now();
				System.out.println(name+" ("+dtf.format(now)+")");
			}
			catch(InterruptedException e)
			{}
		}
	}
}
