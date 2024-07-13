package BackTracking;
import java.util.Scanner;

public class subString {
    public static void printSubStrings(String str, String ans, int n, int index) {
        if (index == n) {
            System.out.println(ans);
            return;
        }
        printSubStrings(str, ans, n, index + 1);
        printSubStrings(str, ans + str.charAt(index), n, index + 1);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            int n = str.length();
            printSubStrings(str, "", n, 0);
        }
    }
}
