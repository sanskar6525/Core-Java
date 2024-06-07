package GenericsConcept;

public class Gen5<T extends Test4 & Interface_1> //The generic class is extending the class Test4 and the interface Interface_1
{
	T obj;
	Gen5(T o)
	{
		this.obj=o;
	}
	public void show1()
	{
		System.out.println("The type of object is: "+this.obj.getClass().getName());
		System.out.println("The name associated with the type parameter is: "+ obj.name);
		System.out.println("The number associated with the type parameter is: "+ obj.marks);
		obj.display();
	}

	public T getObj()
	{
		return this.obj;
	}
}