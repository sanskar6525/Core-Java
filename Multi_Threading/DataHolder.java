package Multi_Threading;

public class DataHolder {
	String data;
	boolean empty=true; //By default considering that there is no data in the data holder
	
	public synchronized String take() throws InterruptedException
	{
		while(empty) //Loop gets executed if the data handler is empty
		{
			wait(); //Waits until there is data in the data handler
		}
		empty=true;
		notifyAll(); //notifies other thread that data has been removed from the handler
		return data;
	}
	
	public synchronized void put(String s) throws InterruptedException
	{
		while(!empty) //Loop gets executed if the data handler is not empty
		{
			wait(); //Waits until the already existing data in the data handler is removed 
		}
		empty=false; 
		data=s;
		notifyAll(); //notifies other thread that data has been added to the handler
	}
}
