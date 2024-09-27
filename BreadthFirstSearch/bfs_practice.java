package BreadthFirstSearch;
import java.util.*;
public class bfs_practice {
	
	public static void bfs_1(TreeNode r)
	{
		if(r==null)
			return;
		Queue<TreeNode> q=new LinkedList<>();
		q.offer(r);
		while(!q.isEmpty())
		{
			TreeNode temp=q.poll();
			System.out.print(temp.val+"-->");
			if(temp.left!=null)
				q.offer(temp.left);
			
			if(temp.right!=null)
				q.offer(temp.right);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root=TreeNode.populate();
		bfs_1(root);

	}

}
