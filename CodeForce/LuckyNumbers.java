// package CodeForce;

import java.util.Scanner;

public class LuckyNumbers {
    public static int maxLuckyNumbers(int n) {
        // Calculate the sum of powers of 2 from 1 to n
        int totalLuckyNumbers = (int) Math.pow(2, n + 1) - 2;
        return totalLuckyNumbers;
    }

    public static void main(String[] args) {
        try (// Read the input
        Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            // Compute and print the result
            System.out.println(maxLuckyNumbers(n));
        }
    }
}
