package NestedClass;

public class Calci {
	  
    interface Integermath {
        abstract void operation(int a, int b);   //Functional Interface because it has a single abstract function 
    }
  
    public void operate(int a, int b, Integermath op) {
         op.operation(a, b);
    }
 
    public static void main(String[] args) {
    
        Calci obj = new Calci();
        Integermath addition = (a, b) ->{ System.out.println("The sum is:");
        System.out.println(a+b);};//Using lambda expression to perform addition
        
        
        
        //Integermath subtraction = (a, b) -> a - b; //Using lambda expression to perform subtraction
        //Integermath multiplication=(int a,int b) -> a*b; //Using lambda expression to perform multiplication
        
        obj.operate(40, 2, addition);
        //System.out.println("20 - 10 = " +obj.operate(20, 10, subtraction)); 
        //System.out.println("20 - 10 = " + obj.operate(2, 9, multiplication)); 
    }
}