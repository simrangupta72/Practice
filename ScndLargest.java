import java.util.Arrays;
import java.util.Scanner;

public class ScndLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. elements in the array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array");
		for(int j=0;j<n;j++) {
			arr[j]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest: "+arr[n-1]);
		System.out.println("2nd Largest: "+arr[n-2]);
	}

}
