import java.util.Scanner;

public class Candies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter your input for array");
		String s=sc.next()+sc.nextLine();
		String[] str = s.split(" ");
		int size=str.length;
		int arr[] = new int [size];
	    for(int i=0; i<size; i++) {
	    	arr[i] = Integer.parseInt(str[i]);
	    }
	     int arr1[]=new int[size];
	     int arr2[]=new int[size];
	     for(int i=0;i<size;i++){
	            arr1[i]=1;
	            arr2[i]=1;
	        }
	     for(int i=1;i<size;i++) {
	    	 if(arr[i]>arr[i-1]) {
	    		 arr1[i]=arr1[i-1]+1;
	    	 }
	     }
	     for(int i=size-2;i>=0;i--) {
	    	 if(arr[i]>arr[i+1]) {
	    		 arr2[i]=arr2[i+1]+1;
	    	 }
	     }
	     for(int i=0;i<size;i++) {
	    	 if(arr1[i]>arr2[i]) {
	    		 sum=sum+arr1[i];
	    	 }
	    	 else if(arr2[i]>arr1[i]) {
	    		 sum=sum+arr2[i];
	    	 }
	    	 else if(arr2[i]==arr1[i]) {
	    		 sum=sum+arr1[i];
	    	 }
	     }
	     System.out.println(sum);
	}

}
