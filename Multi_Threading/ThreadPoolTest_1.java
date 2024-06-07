package Multi_Threading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolTest_1 {
	static final int MAX_T = 3;             
		  
    public static void main(String[] args)
    {
        // creates five tasks
        Runnable r1 = new TaskA("task 1");
        Runnable r2 = new TaskA("task 2");
        Runnable r3 = new TaskA("task 3");
        Runnable r4 = new TaskA("task 4");
        Runnable r5 = new TaskA("task 5");      
          
       
        ExecutorService pool = Executors.newFixedThreadPool(MAX_T);  
         
      
        pool.execute(r1);
        pool.execute(r2);
        pool.execute(r3);
        pool.execute(r4);
        pool.execute(r5); 
     
        pool.shutdown();    
    }
}
