package Multi_Threading;

import java.util.Random;

public class Producer extends Thread {
	DataHolder d;
	public Producer(DataHolder s)
	{
		d=s;
	}
	public void run()
	{
		String importantInfo[] = {
	            "Mares eat oats",
	            "Does eat oats",
	            "Little lambs eat ivy",
	            "A kid will eat ivy too"
	        };
	        Random random = new Random();

	        for (int i = 0;
	             i < importantInfo.length;
	             i++) {
	            try {
					d.put(importantInfo[i]);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
	            try {
	                Thread.sleep(random.nextInt(5000));
	            } catch (InterruptedException e) {}
	        }
	        try {
				d.put("DONE");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	    }
}

