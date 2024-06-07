package GenericsConcept;
import java.util.*;
import java.util.ArrayList;
public class Methods {
	public static void main(String[] args)
	{
		ArrayList<String> L1=new ArrayList<>();
		L1.add("ygdsg");
		//L1.add(6); //Not possible
		
		ArrayList<?> L2=new ArrayList<Integer>();
		L2.add(null); //Only null can be added
		//L2.add(9); //Only null can be added
		//L2.add("we"); //Not possible
		
		ArrayList<?> L3=new ArrayList<String>();
		L3.add(null); //Only null can be added
		//L3.add("we"); //Only null can be added
		
		ArrayList<? extends Number> L4=new ArrayList<Double>();
		L4.add(null); //Only null can be added
		//L4.add(6.76); //Only null can be added
		
		ArrayList<? super Integer> L5=new ArrayList<Number>();
		L5.add(9); //Because of super keyword, we can add to the list
		
		ArrayList<? super String> L6=new ArrayList<String>();
		L6.add("erer"); //Because of super keyword, we can add to the list
	}
}
