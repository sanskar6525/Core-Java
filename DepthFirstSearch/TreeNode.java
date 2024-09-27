package DepthFirstSearch;

public class TreeNode {
	public TreeNode right;
	public TreeNode left;
	public int val;
	
	TreeNode(int v)
	{
		this.val=v;
		this.right=null;
		this.left=null;
	}
	
	public static TreeNode populate()
	{
		TreeNode rootTreeNode = new TreeNode(1);
	    TreeNode treeNode2 = new TreeNode(2);
	    TreeNode treeNode3 = new TreeNode(3);
	    TreeNode treeNode4 = new TreeNode(4);
	    TreeNode treeNode5 = new TreeNode(5);
	    TreeNode treeNode6 = new TreeNode(60);
	    TreeNode treeNode7 = new TreeNode(7);
	    TreeNode treeNode8 = new TreeNode(8);
	 
	    rootTreeNode.left = treeNode2;
	    rootTreeNode.right = treeNode3;
	 
	    treeNode2.left = treeNode4;
	    treeNode2.right = treeNode5;
	    treeNode3.right = treeNode6;
	 
	    treeNode5.left = treeNode7;
	    treeNode5.right = treeNode8;
	 
	    return rootTreeNode;
	}

}
