import java.util.Scanner;
public class MinimumPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of rows of grid: ");
		int m=sc.nextInt();
		System.out.println("Enter no. of cols of grid: ");
		int n=sc.nextInt();
		int grid[][]=new int[m][n];
		System.out.println("Enter elements of grid: ");
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				grid[i][j]=sc.nextInt();
			}
		}
		int sum1=0;
        int sum2=0;
        if(m==1 && n==1){
            System.out.println("minimum sum is: "+grid[0][0]);
        }
        else{
        	System.out.print("minimum sum is: ");
            for(int row=0;row<n;row++){
                sum1=sum1+grid[0][row];
            }
            //System.out.println(sum1);
            
            for(int col=0;col<m;col++){
                sum2=sum2+grid[col][0];
            }
            //System.out.println(sum2);
            if(sum1<=sum2){
                for(int col=1;col<m;col++){
                sum1=sum1+grid[col][n-1];
            }
                System.out.println(sum1);
               
            }
            else if(sum2<sum1){
                for(int row=1;row<n;row++){
                sum2=sum2+grid[m-1][row];
            }
                System.out.println(sum2);
                
            }
        }
	}

}
