package DataStructure.Tree;
import java.util.*;



public class BST {
	private static Node root;
	private static class Node{
		int val;
		int height; 
		Node left;
		Node right;
		
		public Node(int x)
		{
			val=x;
			height=0;
		}
	}
	

	public static boolean isEmpty()
	{
		if(root==null)
			return true;
		return false;
	}
	
	public static void display()
	{
		display(root,"Root Node: ");
	}
	
	public static void display(Node node, String details)
	{
		if(node==null)
			return;
		
		System.out.println(details+node.val);
		display(node.left,"Left child of "+node.val+": ");
		display(node.right,"Right child of "+node.val+": ");
	}
	
	public static void insert(int value)
	{
		
		root=insert(value,root);
			
			
	} 
	private static Node insert(int value,Node node)
	{
		if(node==null)
		{
			Node t=new Node(value);
			return t;
		}
		if(value<node.val)
			node.left=insert(value,node.left);
		if(value>node.val)
			node.right =insert(value,node.right);
		
		 node.height=Math.max(height(node.right), height(node.left));
		return node;
	}
	
	
	public static boolean isBalanced(Node node)
	{
		if(node==null)
			return true;
		return Math.abs(height(node.left)-height(node.right))<=1 && isBalanced(node.right) && isBalanced(node.left);
	 }
	
	public static void populate(int nums[])
	{
		for(int i:nums)
		{
			insert(i);
		}
	}
	public static int height(Node r)
	{
		if(r==null)
			return 0;
		if(r.left==null && r.right==null)
		{
			r.height=0;
			return r.height;
		}
			
		int h1=height(r.left);
		int h2=height(r.right);
		r.height=Math.max(h1, h2);
		return 1+r.height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7,8,9,10,11};
		populate(nums);
		display();
		System.out.println(height(root));
		
	}

}
