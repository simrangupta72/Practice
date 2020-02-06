import java.util.Scanner;


public class MergeLinkedList {
	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}

	}

	public static MergeLinkedList insert(MergeLinkedList li, int data) {
		Node newNode = new Node(data);
		newNode.next = null;
		if (li.head == null)
			li.head = newNode;
		else {
			Node last = li.head;
			while (last.next != null) {
				last = last.next;
			}
			last.next = newNode;
		}
		return li;
	}

	public static void display(MergeLinkedList li) {
		Node temp = li.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void Merge(MergeLinkedList li1, MergeLinkedList li2, MergeLinkedList li3) {
		Node temp=li1.head;
		Node temp2=li2.head;
		Node temp3=li3.head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next=temp2;
		while (temp2.next != null) {
			temp2 = temp2.next;
		}
		temp2.next=temp3;
	}
	public static void sort(MergeLinkedList li1) {
		
		Node current = li1.head, index = null;  
        int temp;  
          
        if(li1.head == null) {  
            return;  
        }  
        else {  
            while(current != null) {   
                index = current.next;  
                  
                while(index != null) {  
                    if(current.data > index.data) {  
                        temp = current.data;  
                        current.data = index.data;  
                        index.data = temp;  
                    }  
                    index = index.next;  
                }  
                current = current.next;  
            }      
        }  
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MergeLinkedList li1=new MergeLinkedList();
		MergeLinkedList li2=new MergeLinkedList();
		MergeLinkedList li3=new MergeLinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of elements you want to insert in Linked List 1");
		int n=sc.nextInt();
		System.out.println("Enter your elements for linked list 1");
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			li1.insert(li1, num);
		}
		System.out.println("Your first linked list is: ");
		li1.display(li1);
		
		System.out.println("Enter no. of elements you want to insert in Linked List 2");
		int n2=sc.nextInt();
		System.out.println("Enter your elements for linked list 2");
		for(int i=0;i<n2;i++) {
			int num=sc.nextInt();
			li2.insert(li2, num);
		}
		System.out.println("Your second linked list is: ");
		li2.display(li2);
		
		System.out.println("Enter no. of elements you want to insert in Linked List 3");
		int n3=sc.nextInt();
		System.out.println("Enter your elements for linked list 3");
		for(int i=0;i<n3;i++) {
			int num=sc.nextInt();
			li3.insert(li3, num);
		}
		System.out.println("Your third linked list is: ");
		li3.display(li3);
		
		Merge(li1,li2,li3);
		System.out.println("Your merged linked list is: ");
		li1.display(li1);
		sort(li1);
		System.out.println("Your sorted linked list is: ");
		li1.display(li1);
	}

}
