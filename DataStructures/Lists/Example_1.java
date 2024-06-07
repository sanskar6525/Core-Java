package DataStructures.Lists;

import java.util.*;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> L1=new ArrayList<String>();
		L1.add("Anmol");
		L1.add("Tanya");
		L1.add("Raunak");
		L1.add("Ramesh");
		
		
		
		List<String> L2=new ArrayList<String>();
		L2.add("0");
		L2.add("1");
		L2.add("TEST");
		L2.add("2");
		L2.add("3");
		L2.add("TEST");
		
		System.out.println(L1);
		System.out.println(L1.size());
		System.out.println(L1.add("Suresh"));
		L1.set(0, "MSD");
		L1.remove(2);
		System.out.println(L1);
		
		System.out.println(L2);
		
		L1.addAll(L2);
		System.out.println(L1);
		
		
		

	}

}
