package Multi_Threading;

public class Test {
	public static void main(String[] args)
	{
		System.out.println("Default names of thread:");
		System.out.println(Thread.currentThread().getName()+"\n"); //Default name of main thread
		Thread_Creation2 obj1=new Thread_Creation2(); 
		System.out.println(obj1.getName()+"\n"); //Default name of thread 1
		
		Thread_Creation1 obj2=new Thread_Creation1();		
		Thread t1=new Thread(obj2);
		System.out.println(t1.getName()+"\n"); //Default name of thread 2
		
		
		System.out.println("\nAltered names of thread:");
		Thread.currentThread().setName("Sa");
		obj1.setName("T1");
		t1.setName("T2");
		System.out.println(Thread.currentThread().getName()+"\n"); //Altered name of main thread
		System.out.println(obj1.getName()+"\n"); //Altered name of thread 1
		System.out.println(t1.getName()+"\n"); //Altered name of thread 2

		
	}

}
