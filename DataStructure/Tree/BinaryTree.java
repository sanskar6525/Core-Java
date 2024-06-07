package DataStructure.Tree;
import java.util.*;

public class BinaryTree {
	private static Node root;
	
	private static class Node
	{
		int val;
		Node left;
		Node right;
		int height;
		public Node(int x)
		{
			val=x;
			height=0;
		}
	}
	public BinaryTree()
	{
		
	}
	
	//To insert the root element followed by the other elements
	public static void populate(Scanner sc)
	{
		System.out.println("Enter the root Node: ");
		int n=sc.nextInt();
		root=new Node(n);
		populate(sc,root);
	}
	
	public static void populate(Scanner sc,Node r)
	{
		System.out.println("Do you want to enter the left of "+r.val);
		boolean left=sc.nextBoolean();
		if(left)
		{
			System.out.println("Enter the value of the left of "+r.val);
			int v=sc.nextInt();
			r.left=new Node(v);
			populate(sc,r.left);
		}
		
		System.out.println("Do you want to enter the right of "+r.val);
		boolean right=sc.nextBoolean();
		if(right)
		{
			System.out.println("Enter the value of the right of "+r.val);
			int v=sc.nextInt();
			r.right=new Node(v);
			populate(sc,r.right);
		}
	}
	
	public static void display()
	{
		display(root,"");
	}
	
	public static void display(Node n,String indent)
	{
		if(n==null)
			return;
		
		System.out.println(indent+n.val);
		display(n.left,indent+"\t");
		display(n.right,indent+"\t");
		
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		populate(sc);
		display();
	}
}
