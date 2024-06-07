package GeneralCodes;

abstract class animal 
{
	public abstract void sound ( ) ;
}
public class lion extends animal 
{
	public void sound ( )
	{
		System.out.println("Roar");
	}
	public static void main ( String args [ ] ) 
	{
		animal obj = new lion ( );
		obj. sound ();
	}
}