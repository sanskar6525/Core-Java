package NestedClass;

public class AnonymousClassDemo {
	
	String pre1="Hello ";
	String pre2="Salut ";
	String pre3="Hola ";
	String pre4="Vanakkam ";
	
	interface HelloWorld {
        public void greetSomeone(); 
    }
	public void Say(String n)
	{
		String pos=" !";
		class English implements HelloWorld //Local Class implementing the interface
		{
            public void greetSomeone() {
                System.out.println(pre1 + n + pos+ "\n");
            }
        }
		
		English Eng=new English(); 
		Eng.greetSomeone();
		
		HelloWorld French=new HelloWorld() {
			public void greetSomeone() {
                System.out.println(pre2 + n + pos+ "\n"); /*Anonymous class is able to access outer class members,local variables 
                of enclosing method and also the parameters passed to enclosing method*/
            }
		};
		
		HelloWorld Spanish=new HelloWorld() {
			public void greetSomeone() {
                System.out.println(pre3+ n + pos+ "\n"); /*Anonymous class is able to access outer class members,local variables 
                of enclosing method and also the parameters passed to enclosing method*/
            }
		};
		HelloWorld Tamil=new HelloWorld() {
			public void greetSomeone() {
                System.out.println(pre4+ n + pos+ "\n"); /*Anonymous class is able to access outer class members,local variables 
                of enclosing method and also the parameters passed to enclosing method*/
            }
		};
		
		Hindi hindi=new Hindi() { //Anonymous class extending an abstract class
			public void greet()
			{
				System.out.println(p+n+pos);
			}
		};
		French.greetSomeone(); 
		Spanish.greetSomeone();
		hindi.greet();
		Tamil.greetSomeone();
	}
	public static void main(String[] args)
	{
		AnonymousClassDemo obj=new AnonymousClassDemo();
		obj.Say("Vipul");
	}
}
