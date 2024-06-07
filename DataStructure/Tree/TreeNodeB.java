package DataStructure.Tree;

public class TreeNodeB {
	public TreeNodeB right;
	public TreeNodeB left;
	public int val;
	public int height;
	
	TreeNodeB(int v)
	{
		this.val=v;
		this.right=null;
		this.left=null;
	}
	
	public static TreeNodeB populate()
	{
		TreeNodeB root = new TreeNodeB(1);
	    TreeNodeB treeNode2 = new TreeNodeB(2);
	    TreeNodeB treeNode3 = new TreeNodeB(3);
	    TreeNodeB treeNode4 = new TreeNodeB(4);
	    TreeNodeB treeNode5 = new TreeNodeB(5);
	    TreeNodeB treeNode6 = new TreeNodeB(6);
	    TreeNodeB treeNode7 = new TreeNodeB(7);
	    TreeNodeB treeNode8 = new TreeNodeB(8);
	 
	    root.left = treeNode2;
	    root.right = treeNode3;
	 
	    treeNode2.left = treeNode4;
	    treeNode2.right = treeNode5;
	    treeNode3.right = treeNode6;
	 
	    treeNode5.left = treeNode7;
	    treeNode5.right = treeNode8;
	 
	    return root;
	}

}


