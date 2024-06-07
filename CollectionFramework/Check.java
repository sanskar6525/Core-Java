package CollectionFramework;
import java.util.*;
public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] numbers = new Integer[] { 1, 2, 3 };
		List<Integer> list = Arrays.asList(numbers);;
		List<Integer> L=new ArrayList<>();
		Collections.addAll(L, numbers);
		
		System.out.println(L);

	}

}
