package BreadthFirstSearch;
import java.util.*;
public class bfs_Tree {
	public static void bfs(TreeNode root)
	{
		if(root==null)
			return;
		if(root.right==null && root.left==null)
		{
			System.out.println(root.val);
			return;
		}
		
		Queue<TreeNode> q=new LinkedList<>();
		q.add(root);
		while(!q.isEmpty())
		{
			TreeNode curr=q.poll();
			System.out.print(curr.val+" -> ");
			
			if(curr.left!=null)
				q.add(curr.left);
			
			if(curr.right!=null)
				q.add(curr.right);
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=TreeNode.populate();
		bfs(root);

	}

}
