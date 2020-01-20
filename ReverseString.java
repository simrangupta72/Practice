import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of test cases");
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			System.out.println("Enter the string:");
			String str=sc.next();
			String arr[]=str.split("\\.");
			for(int j=arr.length-1;j>0;j--) {
				System.out.print(arr[j]+".");
			}
			System.out.print(arr[0]);
		}
	}

}
