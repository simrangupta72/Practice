<<<<<<< HEAD
import java.util.Scanner;

public class LinkedList {
	
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
	public static LinkedList insert(LinkedList li,int data)
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
			last.next=newNode;
		}
		return li;
	}
	public static void display(LinkedList li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static LinkedList deleteDuplicates(LinkedList li) {
        if(li.head == null || li.head.next == null)
            return li;
 
        Node p = li.head;
 
        while( p!= null && p.next != null){
            if(p.data == p.next.data){
                p.next = p.next.next;
            }else{
                p = p.next; 
            }
        }
 
        return li;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements you want to insert");
		int n=sc.nextInt();
		System.out.println("Enter your elements");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			li.insert(li, num);
		}
		System.out.println("Your intial list looks like: ");
		li.display(li);
		System.out.println("After removing duplicates, it looks like: ");
		li.deleteDuplicates(li);
		li.display(li);
	}

}
=======
import java.util.Scanner;

public class LinkedList {
	
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
	public static LinkedList insert(LinkedList li,int data)
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
			last.next=newNode;
		}
		return li;
	}
	public static void display(LinkedList li)
	{
		Node temp=li.head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static LinkedList deleteDuplicates(LinkedList li) {
        if(li.head == null || li.head.next == null)
            return li;
 
        Node p = li.head;
 
        while( p!= null && p.next != null){
            if(p.data == p.next.data){
                p.next = p.next.next;
            }else{
                p = p.next; 
            }
        }
 
        return li;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList li=new LinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements you want to insert");
		int n=sc.nextInt();
		System.out.println("Enter your elements");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			li.insert(li, num);
		}
		System.out.println("Your intial list looks like: ");
		li.display(li);
		System.out.println("After removing duplicates, it looks like: ");
		li.deleteDuplicates(li);
		li.display(li);
	}

}
>>>>>>> c5191afa5d94a40aaaa3c7d6421a83da63de8dda
