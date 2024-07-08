// package CodeForce;
import java.util.Scanner;

public class LuckySumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int four = 0; four * 4 <= n; four++) {
            if (((n - four * 4) % 7) == 0) {
                int sevens = ((n - four * 4)) / 7;
                for (int i = 0; i < four; i++) {
                    System.out.print("4");
                }
                for (int i = 0; i < sevens; i++) {
                    System.out.print("7");
                }
                System.out.println();
                return;
            }
        }
        System.out.println(-1);
    }
}

