package DataStructures.Lists;

public class BasicOperations {
	
	private static class Node
	{
		Node next;
		int val;
		Node(int a)
		{
			val=a;
		}
	}
	
	static Node head;
	public BasicOperations(int v)
	{
		head=new Node(2);
	}
	
	//To calculate the size of the LinkedList
	public static int findSize()
	{
		int size=0;
		if(head==null)
			return size;
		Node curr=head;
		while(curr!=null)
		{
			size++;
			curr=curr.next;
		}
		return size;
	}
	
	//To add elements at all positions in the LinkedList
	public static void addAt(int pos,int value)
	{
		int size=findSize();
		Node res=new Node(value);
		if(head!=null && pos<size-1)
		{
			if(pos==0)
			{
				res.next=head;
				BasicOperations.head=res;
			}
			else
			{
				Node back=head;
				Node forward=back.next;
				
				for(int i=1;i<pos;i++)
				{
					back=back.next;
					forward=back.next;
				}
				back.next=res;
				res.next=forward;
			}
		}
		else if(pos==size)
		{
			Node curr=head;
			while(curr.next!=null)
			{
				curr=curr.next;
			}
			curr.next=res;
		}
	}

	//To delete elements at all positions in the LinkedList
	public static void delAt(int pos)
	{
		int size=findSize();
		if(pos+1<=size)
		{
			if(pos==0)
				BasicOperations.head=head.next;
			else
			{
				Node curr=head;
				for(int i=1;i<pos;i++)
				{
					curr=curr.next;
				}
				if(curr.next.next!=null)
				{
					Node del=curr.next;
					Node temp2=curr.next.next;
					curr.next=temp2;
					del.next=null;
				}
				else
					curr.next=null;
			}
			
		}
	}
	
	//To display all elements of the LinkedList
	public static void display()
	{
		Node curr=head;
		while(curr!=null)
		{
			System.out.print(curr.val+"\t");
			curr=curr.next;
		}
		System.out.println("\n");
	}
	
	//To display a specific element of the LinkedList
	public static void getAt(int pos)
	{
		int size=findSize();
		if(pos<=size-1)
		{
			if(pos==0)
				System.out.println("Element at "+pos+" index position is "+head.val);
			else
			{
				Node curr=head;
				for(int i=1;i<=pos;i++)
				{
					curr=curr.next;
				}
				System.out.println("Element at "+pos+" index position is "+curr.val);
			}
		}
		
	}
	
	//To insert element using recursion
	public static void recursiveInsert(int pos,int value,Node curr)
	{
		if(pos==0)
		{
			if(curr==head)
			{
				Node res=new Node(value);
				res.next=head;
				head=res;
				return;
			}
			else
			{
				Node res=new Node(curr.val);
				curr.val=value;
				res.next=curr.next;
				curr.next=res;
				return;
			}
		}
		recursiveInsert(pos-1,value,curr.next);
	}
	
	//To reverse the LL
	public static void reverse()
	{
		Node last=head;
		while(last.next!=null)
		{
			last=last.next;
		}
		Node curr=head;
		int s=findSize();
		for(int i=1;i<=s/2;i++)
		{
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BasicOperations b=new BasicOperations(2);
		 addAt(1,4);
		 addAt(2,6);
		 addAt(3,8);
		 addAt(4,10);
		 addAt(5,12);
		 
		 display();
		 
		 addAt(0,0);
		 display();
		 addAt(3,999);
		 display();
		 delAt(3);
		 display();
		 getAt(0);
		 getAt(3);
		 
		 recursiveInsert(0,67,head);
		 display();
		 
		 recursiveInsert(3,6557,head);
		 display();
	}
}

