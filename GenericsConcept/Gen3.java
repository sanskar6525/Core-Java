package GenericsConcept;

public class Gen3<T extends Interface_1> //The generic class is extending an interface
{
	T obj;
	Gen3(T o)
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