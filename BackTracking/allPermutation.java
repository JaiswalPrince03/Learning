package BackTracking;
import java.util.Scanner;

public class AllPermutation {
    public static void printPermutation(String str, int n, int index){
        if(index == n){
            System.out.println(str);
            return;
        }
        for(int i=index; i<n; i++){
            String swappedStr = swap(str, i, index);
            printPermutation(swappedStr, n, index+1);
        }
    }

    // Define the swap method within the AllPermutation class
    public static String swap(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int n = str.length();
            printPermutation(str, n, 0);
        }
    }
}
