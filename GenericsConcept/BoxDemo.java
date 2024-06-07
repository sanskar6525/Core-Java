package GenericsConcept;
import java.util.*;
import java.util.ArrayList;
public class BoxDemo 
{
	public static <U> void addBox(U u,List<Box<U>> boxes) //Generic Method 1
	{
		    Box<U> box = new Box<>();
		    box.set(u);
		    boxes.add(box);
	}

	public static <U> void outputBoxes(List<Box<U>> boxes) //Generic Method 2
	{
	    int counter = 0;
	    for (Box<U> box: boxes) 
	    {
	      U boxContents = box.get();
	      System.out.println("Box #" + counter + " contains [" +
	             boxContents.toString() + "]");
	      counter++;
	    }
	}

	public static void main(String[] args) 
	{
		    ArrayList<Box<Integer>> listOfIntegerBoxes =new ArrayList<>();
		    BoxDemo.<Integer>addBox(Integer.valueOf(10), listOfIntegerBoxes); //Invoking by explicitly providing the type parameter
		    BoxDemo.addBox(Integer.valueOf(20), listOfIntegerBoxes); //Invoking by type inference and thus not explicitly providing type parameter
		    BoxDemo.addBox(Integer.valueOf(30), listOfIntegerBoxes);
		    BoxDemo.<Integer>outputBoxes(listOfIntegerBoxes);
	}
}


