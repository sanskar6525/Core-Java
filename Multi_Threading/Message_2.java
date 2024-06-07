package Multi_Threading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message_2 
{
	public  static void  display(String name) 
	{
		long startTime = System.currentTimeMillis();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		synchronized(Message_2.class)   //Synchronized Block
		{
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
}
