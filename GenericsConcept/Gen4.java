package GenericsConcept;

public class Gen4<T extends Test2> //The generic class is extending the class Test2
{
	T obj;
	Gen4(T o)
	{
		this.obj=o;
	}
	public void show1()
	{
		System.out.println("The type of object is: "+this.obj.getClass().getName());
		System.out.println("The name associated with the type parameter is: "+ obj.school);
		System.out.println("The number associated with the type parameter is: "+ obj.ID);
	}
	public T getObj()
	{
		return this.obj;
	}
}