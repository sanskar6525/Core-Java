package NestedClass;

public class Calculator {
	  
    interface IntegerMath {
        abstract int operation(int a, int b);   //Functional Interface because it has a single abstract function 
    }
  
    public int operate(int a, int b, IntegerMath op) {
        return op.operation(a, b);
    }
 
    public static void main(String[] args) {
    
        Calculator obj = new Calculator();
        IntegerMath addition = (a, b) -> a + b; //Using lambda expression to perform addition
        IntegerMath subtraction = (a, b) -> a - b; //Using lambda expression to perform subtraction
        IntegerMath multiplication=(int a,int b) -> a*b; //Using lambda expression to perform multiplication
        
        System.out.println("40 + 2 = " +obj.operate(40, 2, addition));
        System.out.println("20 - 10 = " +obj.operate(20, 10, subtraction)); 
        System.out.println("20 - 10 = " + obj.operate(2, 9, multiplication)); 
    }
}