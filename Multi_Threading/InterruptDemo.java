package Multi_Threading;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class InterruptDemo 
{
	public static void main(String[] args) throws InterruptedException
	{
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		ThreadCreate2 T1=new ThreadCreate2();
		T1.start();
		//T1.join();
		T1.interrupt();
		now=LocalDateTime.now();
		String d=dtf.format(now);
		System.out.println("End of main happens at: "+d);
	}
}
