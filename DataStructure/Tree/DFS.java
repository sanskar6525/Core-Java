package DataStructure.Tree;

import java.util.Stack;



public class DFS {
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
	  void dfsStack(Node node) {
		    if(node == null) {
		      return;
		    }
		    Stack<Node> stack = new Stack<>();
		    stack.push(node);

		    while(!stack.isEmpty()) {
		      Node removed = stack.pop();
		      System.out.print(removed.val + " ");
		      if(removed.right != null) {
		        stack.push(removed.right);
		      }
		      if(removed.left != null) {
		        stack.push(removed.left);
		      }
		    }
		  }

}
