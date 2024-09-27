package CollectionFramework;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> L=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
		
		L.stream().forEach(e -> System.out.print(e+"\t"));
		
		System.out.println();
		L.parallelStream().forEach(e -> System.out.print(e+"\t"));
		
		System.out.println();
		L.stream()
		.filter(e->e>9)
		.forEach(e -> System.out.print(e+"\t"));
		
		System.out.println();
		
		
		String t=L.stream().filter(e->e>9).map(e->e.toString()).collect(Collectors.joining("##"));
		System.out.println(t);
		
	}

}
