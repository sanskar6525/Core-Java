package Multi_Threading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SleepDemo {
	public static void main(String[] args) throws InterruptedException
	{
		 long startTime = System.currentTimeMillis();
		 DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		 LocalDateTime now = LocalDateTime.now();
		 System.out.println("Starting time is: "+dtf.format(now));
		 for(int i=0;i<2;i++)
		 { 
			 now=LocalDateTime.now();
			 System.out.println("Main Thread: "+dtf.format(now));
			 Thread.currentThread().sleep(10000); //Sleep for 60 seconds
		 }
		 now=LocalDateTime.now();
		 System.out.println("End time is: "+dtf.format(now));
	}
}
