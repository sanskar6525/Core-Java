package DataStructure.Tree;


public class AVL {
	public AVL(int t)
	{
		root=new Node(t);
		//root.val=t;
	}

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
		return rotate(node);
	}
	
	private static Node rotate(Node node) {
		// TODO Auto-generated method stub
		int dif=Math.abs(height(node.right)-height(node.left));
		if(height(node.left)-height(node.right)>1)
		{//left heavy
			if(height(node.left.left)-height(node.left.right)>0)
			{//left-left heavy
				return rightRotate(node);
			}
			
			if(height(node.left.right)-height(node.left.left)>0)
			{//left-right heavy
				node.left= leftRotate(node.left);
				return rightRotate(node);
			}
		}
		if(height(node.right)-height(node.left)>1)
		{//right heavy
			if(height(node.right.left)-height(node.right.right)>0)
			{//right-left heavy
				node.right=rightRotate(node.right);
				return leftRotate(node);
			}
			if(height(node.right.right)-height(node.right.left)>0)
			{//right-right heavy
				return leftRotate(node);
			}			
		}
			
		return node;
	}

	private static Node leftRotate(Node p) {
		// TODO Auto-generated method stub
		Node c=p.right;
		Node t=c.left;
		c.left=p;
		p.right=t;
		
		p.height=Math.max(height(p.left),height(p.right)+1);
		c.height=Math.max(height(c.left),height(c.right)+1);
		return c;
	}

	private static Node rightRotate(Node p) {
		// TODO Auto-generated method stub
		
		Node c=p.left;
		Node t=c.right;
		c.right=p;
		p.left=t;
		
		p.height=Math.max(height(p.left),height(p.right)+1);
		c.height=Math.max(height(c.left),height(c.right)+1);
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVL T=new AVL(0);
		for(int i=1;i<1000;i++)
			insert(i);
		
		System.out.println(height(root));
	}

}
