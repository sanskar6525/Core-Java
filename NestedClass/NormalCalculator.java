package NestedClass;



public class NormalCalculator {
	
	
	public interface Calci{
		abstract int operation(int a,int b);
	}
	
	public void answer(int a,int b,Calci op)
	{
		System.out.println(op.operation(a,b));
	}
	
	
	public static void main(String [] args)
	{
		Calci add=new Calci(){

			@Override
			public int operation(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		
		Calci sub=new Calci() {
			
			@Override
			public int operation(int a,int b)
			{
				return Math.abs(a-b);
			}
		};
		
		NormalCalculator obj=new NormalCalculator();
		obj.answer(9, 1, add);
		
		
	}
	
	}


