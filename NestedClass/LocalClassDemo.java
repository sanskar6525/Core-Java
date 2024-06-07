package NestedClass;

public class LocalClassDemo {
	
	  String regularExpression; //Outer Class variable
	    // "[^0-9]" basically an expression to find any character which is not a digit
	  
	  static String finalNum=null;
	    public void validate(String mo)
	    {
	    	 int numlen=10; //Local variable 
	    	
	    	class phoneNumber  //Local class inside a method
	    	{
	    		
	    		phoneNumber(String m)
	    		{
	    			//Removing all non-digit characters
	    			String convert=m.replaceAll(regularExpression, ""); //Local Class can access outer class members
	    			
	    			if(convert.length()==numlen) //Local Class can access local variable
	    			{
	    				finalNum=convert;
	    			}
	    			else
	    			{
	    				finalNum=null;
	    			}
	    		}
	    		public String get()
	    		{
	    			return finalNum;
	    		}
	    		
	    		public  void print()
	    		{
	    			System.out.println("The original number is : " + mo); //Local class method can access the inclosing method's parameters as well
	    		}
	    	}
	    	phoneNumber obj=new phoneNumber(mo); //Instantiation of the local class
	    	String ne=obj.get(); //Invoking the local class method
	    	obj.print();
	    	if(ne!=null)
	    	{
	    		
	    		System.out.println("Number is valid");
	    	}
	    	else
	    	{
	    		System.out.println("Number is  not valid");
	    	}
	    }
	    public static void main(String[] args)
	    {
	    	LocalClassDemo obj1=new LocalClassDemo();
	    	obj1.regularExpression= "[^0-9]";
	    	obj1.validate("256-367-3677");
	    }
}
