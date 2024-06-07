package Multi_Threading;


import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskA implements Runnable {
	private String name;
	public TaskA(String a)
	{
		name=a;
	}
	public void run()
	{
		try
        {
            for (int i = 0; i<=5; i++)
            {
                if (i==0)
                {
                	LocalTime time = LocalTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
                    System.out.println("Initialization Time for task name - " + name + " = " + time.format(formatter));
  
                    //prints the initialization time for every task 
                }
                else
                {
                	LocalTime time = LocalTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
                    System.out.println("Executing Time for task name - " + name + " = " + time.format(formatter));
                    // prints the execution time for every task 
                }
                Thread.sleep(1000);
            }
            System.out.println(name+" complete");
        }
          
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
	}

}



