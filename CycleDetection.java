
import java.util.Scanner;

public class CycleDetection {
	

	    static class SinglyLinkedListNode {
	        public int data;
	        public SinglyLinkedListNode next;

	        public SinglyLinkedListNode(int nodeData) {
	            this.data = nodeData;
	            this.next = null;
	        }
	    }

	    static class SinglyLinkedList {
	        public SinglyLinkedListNode head;
	        public SinglyLinkedListNode tail;

	        public SinglyLinkedList() {
	            this.head = null;
	            this.tail = null;
	        }

	        public void insertNode(int nodeData) {
	            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

	            if (this.head == null) {
	                this.head = node;
	            } else {
	                this.tail.next = node;
	            }

	            this.tail = node;
	        }
	    }

	    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep){
	        while (node != null) {
	            

	            node = node.next;

	            if (node != null) {
	                System.out.println(sep);
	            }
	        }
	    }

	    static boolean hasCycle(SinglyLinkedListNode head) {

	        SinglyLinkedListNode current = head, prev = head; 
	        while (prev != null && current != null && current.next != null) { 
	            prev = prev.next; 
	            current = current.next.next; 
	            if (prev == current) { 

	                return true; 
	            } 
	        } 
	        return false; 

	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args)  {

	        int tests = scanner.nextInt();
	       

	        for (int testsItr = 0; testsItr < tests; testsItr++) {
	            int index = scanner.nextInt();
	           

	            SinglyLinkedList llist = new SinglyLinkedList();

	            int llistCount = scanner.nextInt();
	    
	            for (int i = 0; i < llistCount; i++) {
	                int llistItem = scanner.nextInt();
	       

	                llist.insertNode(llistItem);
	            }
	          
	          	SinglyLinkedListNode extra = new SinglyLinkedListNode(-1);
	            SinglyLinkedListNode temp = llist.head;

	            for (int i = 0; i < llistCount; i++) {
	                if (i == index) {
	                    extra = temp;
	                }

	                if (i != llistCount-1) {
	                    temp = temp.next;
	                }
	            }
	      
	      		temp.next = extra;

	            boolean result = hasCycle(llist.head);

	            System.out.print(String.valueOf(result ? 1 : 0));
	            System.out.println();
	        }

	        scanner.close();
	    }



}
