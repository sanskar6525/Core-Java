package Multi_Threading;

public class A {
	public static void main(String[] args)throws InterruptedException
	{
		 //the Main method executes the main method
		
		 Thread_Creation1 obj1=new Thread_Creation1(); //Thread Instantiation
		 Thread t1=new Thread();
		 Thread t2=new Thread(obj1);
		 t1.start();  //Starting the thread 1
		 t2.start();
		 
		 System.out.println("Main Thread\n");
		 
		 Thread_Creation2 obj2=new Thread_Creation2(); //Thread Instantiation
		 obj2.start(); //Starting the thread 2 
		 
		 for(int i=1;i<=5;i++)
		 {
			//Thread.sleep(4000); //Delay of 4s
			System.out.println("Main Thread ");
		 }
		
    }

}
