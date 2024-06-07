package GenericsConcept;

public class Gen<T> 
{
	T obj;
	Gen(T o)
	{
		this.obj=o;
	}
	public void show()
	{
		System.out.println("The type of object is: "+this.obj.getClass().getName());
	}
	public T getObj()
	{
		return this.obj;
	}
}
