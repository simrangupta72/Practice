
public class LinkedList1 
{
	Node head;
	public static class Node
	{
		int data;
		Node next;
		Node(int d)
		{
			data=d;
		}
		
	}
public static LinkedList1 insert(LinkedList1 li,int data)
{
	Node newNode=new Node(data);
	newNode.next=null;
	if(li.head == null)
	li.head=newNode;
	else
	{
		Node last=li.head;
		while(last.next!=null)
		{
			last=last.next;
		}
		last.next=newNode;s
	}
	return li;
}
public static void display(LinkedList1 li)
{
	Node temp=li.head;
	System.out.println("LinkedList is:");
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
}

public static LinkedList1 delete(LinkedList1 li)
{
	Node temp=li.head;
	while(temp.next.next!=null)
	{
		temp=temp.next;
	}
   temp.next=null;
   return li;
}

public static void reverse(Node temp)
{
	if(temp==null)
	{
		System.out.println("LL does not exist");
	return;
	}
	
	if(temp.next==null)
	{
		System.out.println("The reversed list is:");
		System.out.println(temp.data);
		
	}
	else
	{
		reverse(temp.next);
		System.out.println(temp.data);
	}
}
public static void main(String args[])
{
	LinkedList1 li=new LinkedList1();
	li.insert(li, 10);
	li.insert(li, 20);
	li.insert(li, 30);
	li.insert(li, 40);
	li.insert(li, 50);
	li.display(li);
	li.reverse(li.head);
	
}
}
