package Multi_Threading;

import java.util.Random;

public class Consumer extends Thread {
	DataHolder d;
	public Consumer(DataHolder s)
	{
		d=s;
	}
	public void run()
	{
		Random random = new Random();
        try {
			for (String message = d.take();
			     ! message.equals("DONE");
			     message = d.take()) {
			    System.out.format("MESSAGE RECEIVED: %s%n", message);
			    try {
			        Thread.sleep(random.nextInt(5000));
			    } catch (InterruptedException e) {}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}