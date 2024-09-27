package GreedyAlgorithms;

import java.util.Comparator;

public class HuffmanNode {
	int count;
	char ch;
	HuffmanNode left; 
    HuffmanNode right; 
}

class MyComparator implements Comparator<HuffmanNode>
{
	public int compare(HuffmanNode x,HuffmanNode y)
	{
		return x.count-y.count;
	}
}
