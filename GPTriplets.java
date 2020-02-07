
import java.util.*;

public class GPTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0;
		int num=0;
		int count1=0;
		System.out.println("Enter your input for array");
		String s=sc.next()+sc.nextLine();
		System.out.println("Enter ratio:");
		int k=sc.nextInt();
		String[] str = s.split(" ");
		int size=str.length;
		ArrayList<Integer> arr=new ArrayList<>();
		 //int arr[] = new int [size];
	      for(int i=0; i<size; i++) {
	         int n = Integer.parseInt(str[i]);
	         arr.add(n);
	      }
	      for(int i=0;i<arr.size()-1;i++) {
	    	  if(arr.get(i)==arr.get(i+1)) {
	    		  num= arr.remove(i+1);
	    	  }
	    	  
	      }
	      //System.out.println(num);
	      for(int i=0;i<arr.size()-2;i++) {
	    	  if((arr.get(i+1)/arr.get(i)==k) && (arr.get(i+2)/arr.get(i+1)==k)) {
	    		  count++;
	    		  if(arr.get(i)==num||arr.get(i+1)==num||arr.get(i+2)==num) {
	    			  count1++;
	    		  }
	    	  }
	      }
	      System.out.println(count+count1);
	}

}
