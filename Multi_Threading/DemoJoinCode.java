package Multi_Threading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoJoinCode {
	public static void main(String[] args) throws InterruptedException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Starting time is: "+dtf.format(now));
		ThreadCreate.m=Thread.currentThread();
		ThreadCreate t=new ThreadCreate();
		t.start();
		for(int i=0;i<5;i++)
		{
			now=LocalDateTime.now();
			System.out.println("Main Thread: "+dtf.format(now));
			Thread.sleep(4000); //Delay of 4 seconds in execution
		}
	}
}
