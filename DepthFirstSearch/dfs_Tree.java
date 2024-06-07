package DepthFirstSearch;

import java.util.*;;

public class dfs_Tree {

	public static void dfs_PreOrder(TreeNode root)
	{
		if(root==null)
			return;
		if(root.right==null && root.left==null)
		{
			System.out.println(root.val);
			return;
		}
		
		Stack<TreeNode> s=new Stack<>();
		s.push(root);
		
		while(!s.isEmpty())
		{
			TreeNode curr=s.pop();
			System.out.print(curr.val+" -> ");
			
			if(curr.right!=null)
				s.push(curr.right);
			if(curr.left!=null)
				s.push(curr.left);
		}
	
	}
	
	public static void dfs_InOrder(TreeNode root)
	{
		if(root==null)
			return;
		dfs_InOrder(root.left);
		System.out.print(root.val+" ---> ");
		dfs_InOrder(root.right);
		
	}
	
	public static void dfs_PostOrder(TreeNode root)
	{
		if(root==null)
			return;
		dfs_PostOrder(root.left);
		dfs_PostOrder(root.right);
		System.out.print(root.val+" ---> ");
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		TreeNode root=TreeNode.populate();
		System.out.println("---------PreOrder Traversal----------");
		dfs_PreOrder(root);
		
		System.out.println("\n\n---------InOrder Traversal----------");
		dfs_InOrder(root);
		
		System.out.println("\n\n---------PostOrder Traversal----------");
		dfs_PostOrder(root);
		
		
	}

}
