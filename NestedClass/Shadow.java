package NestedClass;

public class Shadow {

    public int x = 0;
    class FirstLevel 
    {
        public int x = 1;
        void methodInFirstLevel(int x)
        {
            System.out.println("x = " + x); //Here the local variable x is being used
            System.out.println("this.x = " + this.x); //Here the instance variable of inner-class is used
            Shadow te=new Shadow();
            System.out.println("Shadow.this.x = " + te.x); //Here the outer class instance variable is being used
        }
    }

    public static void main(String... args) {
        Shadow obj= new Shadow();
        Shadow.FirstLevel ob = obj.new FirstLevel();
        ob.methodInFirstLevel(07);
    }
}