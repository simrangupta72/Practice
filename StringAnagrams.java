package strings;
import java.util.Scanner;
public class StringAnagrams {
	static void CheckAnagram(String a, String b) {
        // Complete the function
        int lena=a.length();
        a.toLowerCase();
        int lenb=b.length();
        b.toLowerCase();
        int flag=0;
        char[] B = b.toCharArray();
        if(lena!=lenb){
            System.out.println("Not Anagrams");
        }
        else{
            for(int i=0;i<lena;i++){
                for(int j=0;j<lena;j++){
                    if(a.charAt(i)==B[j]|| a.charAt(i)+32==B[j]|| a.charAt(i)==B[j]+32){
                        B[j]=' ';
                        break;
                    }
                }
            }
            for(int i=0;i<lenb;i++){
                if(B[i]!=' '){
                    flag=1;
                }
            }
            if(flag==1){
            	System.out.println("Not Anagrams");
            }
            else{
            	System.out.println("Anagrams");
            }
        }
    }

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        CheckAnagram(a, b);
    }
}
