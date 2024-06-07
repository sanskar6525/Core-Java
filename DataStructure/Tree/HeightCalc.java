package DataStructure.Tree;

import java.util.*;
public class HeightCalc {
	
	public static int  height(TreeNode r)
	{
		if(r==null)
			return 0;
		if(r.left==null && r.right==null)
		{
			r.height=0;
			System.out.println("Height for node "+r.val+" is: "+r.height);
			return 0;
		}
		else
		{
			r.height=Math.max(height(r.left), height(r.right))+1;
			System.out.println("Height for node "+r.val+" is: "+r.height);
			return r.height;  
		}
	}
	
	public static void heightB(TreeNodeB r)
	{
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=TreeNode.populate();
		int t=height(root);
		TreeNodeB rootB=TreeNodeB.populate();
	}

}

