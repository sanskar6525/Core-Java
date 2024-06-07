package Multi_Threading;

public class SimpleThreads {
	public static void threadMessage(String message) {
        String threadName =Thread.currentThread().getName();
        System.out.format("%s: %s%n",threadName,message);
    }
	public static void main(String[] args)throws InterruptedException
	{
		 long patience = 1000 * 60 * 60;
		threadMessage("Starting MessageLoop thread");
        long startTime = System.currentTimeMillis();
        Thread t = new Thread(new MessageLoop());
        t.start();
        
        threadMessage("Waiting for MessageLoop thread to finish");
        while (t.isAlive()) 
        {
            threadMessage("Still waiting...");
            t.join(1000);
            if (((System.currentTimeMillis() - startTime) > patience)&& t.isAlive()) 
            {
                threadMessage("Tired of waiting!");
                t.interrupt();
                t.join();
            }
        }
        threadMessage("Finally!");
    }
}
