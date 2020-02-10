import java.util.*;
public class TotPathPossible {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows of grid: ");
		int m=sc.nextInt();
		System.out.println("Enter no. of cols of grid: ");
		int n=sc.nextInt();
		int factm=1;
		for(int i=1;i<m;i++){
			factm=factm*i;
			}
		int factn=1;
		for(int i=1;i<n;i++){
			factn=factn*i;
			}
		int factot=1;
		for(int i=1;i<(m+n)-1;i++){
			factot=factot*i;
			}
		int path=factot/(factm*factn);
		System.out.println(path);
	}

}
