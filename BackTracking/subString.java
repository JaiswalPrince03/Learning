// package BackTracking;
import java.util.*;
public class subString {
    public static void PrintSubString(String str, String ans, int n,int index){
        if(index == n){
            System.out.println(ans);
            return;
        }
        PrintSubString(str, ans, n, index+1);
        PrintSubString(str, ans+str.charAt(index), n, index+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        PrintSubString(str, "", n, 0);
    }
}
