package DataStructures.Lists;

public class DoublyLinkedList {
	
	private static class Node {
		Node prev,next;
		int val;
		public Node(int x)
		{
			this.val=x;
			this.prev=null;
			this.next=null;
		}

	}

	static Node head,tail;
	public DoublyLinkedList(int x)
	{
		head=new Node(x);
		tail=head;
	}

	//To deduce the size of the DoublyLL
	public static int findSize()
	{
		int size=0;
		if(head==null)
			return size;
		else
		{
			Node curr=head;
			while(curr!=null)
			{
				size++;
				curr=curr.next;
			}
		}
		return size;
	}
	
	//To just append elements into the DoublyLL
	public static void append(int x)
	{
		Node res=new Node(x);
		res.prev=tail;
		tail.next=res;
		tail=res;
	}
	
	//To add element at specific index positions
	public static void addAt(int pos,int x)
	{
		Node res=new Node(x);
		int s=findSize();
		if(pos<=s-1 && head!=null)
		{
			if(pos==0)
			{
				res.next=head;
				head.prev=res;
				head=res;
				if(s==1)
					tail=res.next;
			}
			else if(pos==s-1)
			{
				Node temp=tail.prev;
				temp.next=res;
				res.prev=temp;
				res.next=tail;
				tail.prev=res;
			}
			else
			{
				Node curr=head;
				for(int i=1;i<pos;i++)
				{
					curr=curr.next;
				}
				Node temp=curr.next;
				curr.next=res;
				res.next=temp;
				temp.prev=res;
				res.prev=curr;
			}
		}
	}
	
	//To display all the elements of the DoublyLL
	public static void display()
	{
		if(head==null)
			System.out.println("List is empty !!");
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.val+"\t");
			curr=curr.next;
		}
		System.out.println();
	}
	
	//To remove element at the end
	public static void trim()
	{
		int s=findSize();
		if(s==1)
		{
			head=null;
			tail=null;
		}
		else
		{
			tail=tail.prev;
			tail.next=null;
		}
	}
	
	//To remove an element by matching its value
	public static void remove(int x)
	{
		int s=findSize();
		if(s==1)
		{
			head=null;
			tail=null;
		}
		else
		{
			Node curr=head;
			while(curr!=null)
			{
				if(curr.val==x && curr!=tail)
				{
					Node t=curr.prev;
					t.next=curr.next;
					curr=curr.next;
					curr.prev=t;
					break;
				}
				else if(curr.val==x && curr==tail)
				{
					Node t=curr.prev;
					t.next=null;
					tail=t;
					break;
				}
				curr=curr.next;
			}
		}
	}
	
	//To reverse the DoublyLL
	public static void reverse()
	{
		int s=findSize();
		Node curr=tail;
		for(int i=s;i>=1;i--)
		{
			Node temp=curr.prev;
			if(curr!=tail && curr!=head)
			{
				Node t=curr.next;
				Node u=curr.prev;
				curr.next=u;
				curr.prev=t;
			}
			else if(curr==head)
			{
				curr.prev=curr.next;
				curr.next=null;
			}
			else if(curr==tail)
			{
				curr.next=curr.prev;
				curr.prev=null;
			}
			curr=temp;
		}
		
		Node temp=tail;
		tail=head;
		head=temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList head=new DoublyLinkedList(3);
		append(6);
		append(9);
		append(12);
		System.out.println(findSize());
		display();
		
		addAt(0,0);
		display();
		
		addAt(4,15);
		display();
		
		addAt(3,9999);
		display();
		
		trim();
		display();
		
		append(12);
		remove(9999);
		display();
		
		reverse();
		display();

	}

}

