package GreedyAlgorithms;
import java.util.*;
public class HuffmanCoding 
{
	
	public static void printcode(HuffmanNode root,String s)
	{
		if(root.left==null && root.right ==null && Character.isLetter(root.ch))
		{
			System.out.println(root.ch+":"+s);
			return;
		}
		printcode(root.left,s+"0");
		printcode(root.right,s+"1");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int n=6;
		char[] charArray = { 'a', 'b', 'c', 'd', 'e', 'f' }; 
        int[] charfreq = { 5, 9, 12, 13, 16, 45 }; 
        
        PriorityQueue<HuffmanNode> q=new PriorityQueue<HuffmanNode>(n,new MyComparator());
        
        //To add all the initial characters to both the Huffman tree and also the Priority Queue
        for(int i=0;i<n;i++)
        {
        	HuffmanNode obj=new HuffmanNode();
        	
        	obj.ch=charArray[i];
        	obj.count=charfreq[i];
        	
        	obj.left=null;
        	obj.right=null;
        	
        	q.add(obj);
        }
        
        HuffmanNode root=null;
        
        while(q.size()>1)
        {
        	HuffmanNode temp1=q.peek();
        	q.poll();
        	
        	HuffmanNode temp2=q.peek();
        	q.poll();
        	
        	HuffmanNode res=new HuffmanNode();
        	res.count=temp1.count+temp2.count;
        	res.ch='-';
        	
        	res.left=temp1;
        	res.right=temp2;
        	
        	root=res;
        	
        	q.add(res);
        }
        
        printcode(root,"");
        
        

	}

}
