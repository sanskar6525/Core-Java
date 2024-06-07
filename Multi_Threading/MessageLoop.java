package Multi_Threading;

 class MessageLoop implements Runnable 
 {
	public void run() 
	{
	    String importantInfo[] = {"Mares eat oats","Does eat oats","Little lambs eat ivy",
	    	"A kid will eat ivy too"};
	    try {
            for (int i = 0;i < importantInfo.length;i++) 
            {
            	Thread.sleep(4000);
                SimpleThreads.threadMessage(importantInfo[i]);
            }
	    }
        catch(InterruptedException e)
        {
        	SimpleThreads.threadMessage("I wasn't done!");
        }
	}
 }
