import java.util.Scanner;
public class PatternCreation{
public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    for(int m = 0; m<a; m++){
        for(int i = a; i>0; i--){
            if(i<=m){System.out.print(" ");}
        else{System.out.print(i);}
    }
    for(int i = 2; i<=a; i++){
        if(i<=m){System.out.print(" ");}
        else{System.out.print(i);}
    }
    System.out.println();

    }

}
}