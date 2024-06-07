package GeneralCodes;
import java.util.*;
public class Bicycle {
        
    private int cadence;
    private int gear;
    private int speed;   
    private int id;
    
    private static int numberOfBicycles = 0;
    private static final int limit=2;
        
  
    public static void register(Bicycle B)
    {
    	numberOfBicycles++;
    	Scanner sc=new Scanner(System.in);
    	if(numberOfBicycles>limit)
    		System.out.println("Today's limit to register bicycles is over now. Try again tomorrow !!");
    	else
    	{
    		System.out.println("Enter cadence of the bike : ");
    		B.cadence=sc.nextInt();
    		System.out.println("Enter gear of the bike : ");
    		B.gear=sc.nextInt();
    		System.out.println("Enter speed of the bike : ");
    		B.speed=sc.nextInt();
    		B.id=numberOfBicycles;
    	}
    }
    public void display()
    {
    	System.out.println("\n"+"Bike id : " + this.id);
    	System.out.println("Bike cadence : " + this.cadence);
    	System.out.println("Bike gear : " + this.gear);
    	System.out.println("Bike speed : " + this.speed);
    	System.out.println("\n"+"Total bikes regsitered till now are "+ numberOfBicycles);
    }
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter 1 to register bike or 2 to exit :");
    	int n=sc.nextInt();
    	while(n!=2)
    	{
    		Bicycle B=new Bicycle();
			register(B);
			B.display();
			System.out.println("\n"+"Enter 1 to register bike or 2 to exit :");
			n=sc.nextInt();
    	}
    }
}