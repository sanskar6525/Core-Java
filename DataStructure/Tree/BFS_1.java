package DataStructure.Tree;
import java.util.*;
public class BFS_1 
{
	private static Node root;
	private static class Node{
		int val;
		int height; 
		Node left;
		Node right;
		public Node(int x)
		{
			val=x;
		}
	}
	public static int height(Node node)
	{
		if(node ==null)
			return -1;
		 return node.height;
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
	
	public static void populate(int nums[])
	{
		for(int i:nums)
		{
			insert(i);
		}
	}
	public static void printTree1(Queue<Node> q)
	{
		if(q.isEmpty())
			return;
		Node point=q.remove();
		System.out.print(point.val+" -> ");
		if(point.left!=null)
			q.add(point.left);
		if(point.right!=null)
			q.add(point.right);
		printTree1(q);
	}
	public static void display1()
	{
		if(root!=null)
		{
			//Node point=root;
			System.out.print(root.val+" -> ");
			Queue<Node> q=new LinkedList<>();
			if(root.left!=null)
				q.add(root.left);
			if(root.right!=null)
				q.add(root.right);
			
			printTree1(q);
		}

	}
	public static void bfsTravel(Queue<Node> q,int a)
	{
		Node pointer=q.poll();
		if(pointer.left!=null)
			q.add(pointer.left);
		if(pointer.right!=null)
			q.add(pointer.right);
		if(pointer.val==a)
			return;
		
		bfsTravel(q,a);
	}
	public static int successor(int a)
	{
		int res=0;
		if(root.val==a)
		{
			if(root.left!=null)
				res=root.left.val;
			else
				res=root.right.val;
		}
		else {
			Queue<Node> q=new LinkedList<>();
			if(root.left!=null)
				q.offer(root.left);
			if(root.right!=null)
				q.offer(root.right);
			bfsTravel(q,a);
			if(q.isEmpty())
				res=-1;
			else
				res=q.poll().val;
		}
		return res;
	}
	public boolean isSymmetric(Node root)
	{
		Queue<Node> q=new LinkedList<>();
		q.add(root.left);
		q.add(root.right);
		
		while(!q.isEmpty())
		{
			Node left=q.poll();
			Node right=q.poll();
		
			if(left==null && right==null)
				continue;
		
			if(left==null || right==null)
				return false;
				
			if(left.val!=right.val)
				return false;
			
			q.add(left.left);
			q.add(right.right);
			q.add(left.right);
			q.add(right.left);	
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5,6,7,8,9,10,11};
		populate(nums);
		display1();
		System.out.println("\n"+successor(10));

	}

}
