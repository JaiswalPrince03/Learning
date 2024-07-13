import java.util.Scanner;

public class SumOfDigitsIsPrime {
    public static boolean isPrime(int sum) {
        for (int i = 2; i <= sum / 2; i++) {
            if (sum % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int n = scanner.nextInt();
            int sum = 0;
            while (n > 0) {
                int rem = n % 10;
                sum += rem;
                n /= 10;
            }
            System.out.println("Sum of digits: " + sum);
            if (isPrime(sum)) {
                System.out.println("Sum of digits is a prime number");
            } else {
                System.out.println("Sum of digits is not a prime number");
            }
        }
    }
}
