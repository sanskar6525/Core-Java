package MethodReferences;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class First {
	public static void main(String[] args)
	{
		List<String> names=Arrays.asList("Rahul","Rohit","Pujara","Shreyas","Hardhik");
		Consumer<String> con=new Consumer<String>()
				{
					public void accept(String s)
					{
						System.out.println(s);
					}
				};
		System.out.println("_____By defining the abstract function of the Consumer interface.\n");
		//forEach() method to iterate to each element of the list
		names.forEach(con);
		System.out.println("\n____Using lambda expression.\n");
		names.forEach(str->System.out.println(str));
		System.out.println("\n___Using method referencing.\n");
		names.forEach(System.out::println);
	}

}
