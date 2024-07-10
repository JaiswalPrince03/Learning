package BackTracking;
import java.util.*;
public class allPermutation {
    public static void printPermutation(String str, int n,int index){
        if(index == n){
            System.out.println(str);
            return;
        }
        for(int i=index;i<n;i++){
            str = swap(str, i, index);
            printPermutation(str, n, index+1);
            str = swap(str, i, index);
        }
    }

    // Define the swap method within the allPermutation class
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length();
        printPermutation(str, n, 0);
    }
}
