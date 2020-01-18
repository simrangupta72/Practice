import java.util.*;

public class PythagorianTriplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no. of test cases");
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int flag=0;
			System.out.println("Enter the no. elements in the array");
			int n=sc.nextInt();
			int arr[]=new int[n];
			System.out.println("Enter the elements of the array");
			for(int j=0;j<n;j++) {
				arr[j]=sc.nextInt();
			}

			Arrays.sort(arr);
			for(int k=0;k<n-2;k++) {
				for(int m=1;m<n-1;m++) {
					for(int l=2;l<n;l++) {
						if((arr[k]*arr[k])+(arr[m]*arr[m])==(arr[l]*arr[l])) {
							flag=1;
							break;

						}

					}
				}
			}
			if(flag==1) {
				System.out.println("Pythagorian Triplet");
			}
			else
			System.out.println("No pythagorian Triplet in this array");
		}
	}

}
