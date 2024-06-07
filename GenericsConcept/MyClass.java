package GenericsConcept;
import java.util.ArrayList;
public class MyClass<A>
{
	A a;
	public <T> MyClass(T t)
	{
		ArrayList<A> a1=new ArrayList<A>();
		ArrayList<T> a2=new ArrayList<T>();
		a2.add(t);
		a1.add((A) new Integer(343));
		
		System.out.println(a1.get(0)+"\n");
		System.out.println(a2.get(0)+"\n");
		
		this.print(a1);
	}
	public  void print(ArrayList<?> a2)
	{
		System.out.println(a2.get(0));
	}
	public static void main(String[] args)
	{
		MyClass<Integer> obj1=new MyClass<>("Test"); 
	}
}
