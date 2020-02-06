import java.util.Scanner;

public class MergeKLL {
	Node head;

	public static class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
		}

	}

	public static MergeKLL insert(MergeKLL li, int data) {
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

	public static void display(MergeKLL li) {
		Node temp = li.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}
public static void sort(MergeKLL li1) {
		
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
		Scanner sc=new Scanner(System.in);
		MergeKLL li=new MergeKLL();
		System.out.println("Enter how many linked list you want to enter");
		int k=sc.nextInt();
		
		String arr[]=new String[k];
		System.out.println("Enter your linked lists:");
		for(int i=0;i<k;i++) {
			arr[i]=sc.next()+sc.nextLine();
		}
		String s=arr[0];
		for(int i=1;i<k;i++) {
			s=s+" "+arr[i];
		}
		String[] str = s.split(" ");
		int size=str.length;
		 int array[] = new int [size];
	      for(int i=0; i<size; i++) {
	         array[i] = Integer.parseInt(str[i]);
	      }
	      for(int i=0;i<size;i++) {
	    	  li.insert(li, array[i]);
	      }
	      sort(li);
			System.out.println("Your sorted linked list is: ");
			li.display(li);
	}

}
