package DataStructure.Tree;

public class SegmentTree {
	
	 class Node{
		static int sum,start,end;
		static Node left,right;
		
		public Node(int s,int e)
		{
			start=s;
			end=e;
		}
	}
	static  Node root;
	public SegmentTree(int[] a)
	{
		root=constructTree(a,0,a.length-1);
	}
	public  Node constructTree(int[] a,int star,int en)
	{
		if(star==en)
		{
			Node leaf=this.new Node(star,en);
			leaf.sum=a[star];
			return leaf;
		}
		Node node=new Node(star, en);
		int mid=(star+en)/2;
		node.left=constructTree(a,star,mid);
		node.right=constructTree(a,mid+1,en);
		node.sum=node.left.sum+node.right.sum; 
		return node;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,8,6,7,-2,-8,4,9};
		SegmentTree tree=new SegmentTree(a);
		
	}

}
