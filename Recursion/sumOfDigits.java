public class sumOfDigits {
    public static void main(String[] args) {
        int num = 12345;
        int sum = sumOfDigits(num);
        System.out.println("Sum of digits is " + sum);
    }

    public static int sumOfDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}
