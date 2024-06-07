package Objectss;

public class ObjectSuperClass implements Cloneable {
	String name;
	int roll;
	double marks;
	public ObjectSuperClass(String s,int r,double m)
	{
		name=s;
		roll=r;
		marks=m;
	}
	public  void display()
	{
		System.out.println("Name associated with the object is:"+this.name);
		System.out.println("Roll Number associated with the object is:"+this.roll);
		System.out.println("Marks associated with the object is:"+this.marks+"\n");
	}
	public static void main(String[] args) throws CloneNotSupportedException 
	{
		ObjectSuperClass ob1=new ObjectSuperClass("Yash",5170,92);
		ObjectSuperClass ob2=new ObjectSuperClass("Anubhav",5171,87);
		Object ob3=ob1.clone(); //Created an Object instance to make it store the clone of ob1
		System.out.println("Object 1 has the following: ");
		ob1.display();
		System.out.println("Object 2 has the following: ");
		ob2.display();
		System.out.println("Cloned Object  has the following: ");
		((ObjectSuperClass) ob3).display();
		boolean res1=ob1.equals(ob1);
		System.out.println("Is object 1 and object 1 same: "+res1+"\n");
		
		boolean res2=ob3.equals(ob1);
		System.out.println("Is object 3 and object 1 same: "+res2+"\n");
		
		System.out.println("Object 1 belongs to the class: "+ob1.getClass().getSimpleName());
		System.out.println("Object 1 has inherited from the following classes: "+ob1.getClass().getSuperclass());
		System.out.println("Object 1 has implemented the following interfaces: "+ob1.getClass().getInterfaces()+"\n");
		
		System.out.println("HashCode for Object 1: "+ob1.hashCode());
		System.out.println("HashCode for Object 2: "+ob2.hashCode());
		System.out.println("HashCode for Object 3: "+ob3.hashCode()+"\n");
		
		System.out.println("String representation of Object 1: "+ob1.toString());
		System.out.println("String representation of Object 2: "+ob2.toString());
		System.out.println("String representation of Object 3: "+ob3.toString());
		
		
	}
}