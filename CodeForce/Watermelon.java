// package CodeForce;
import java.util.Scanner;

public class Watermelon {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n % 2 == 0 && n > 2 && n <= 1000000000) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
