public class Fibonacci {
    public static int check(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            int sum = check(num - 1) + check(num - 2);

            return sum;
        }
    }

    public static void main(String[] args) {
        int num = 4;
        int result = check(num);
        System.out.println("Fibonacci of " + num + " is " + result);
    }
}
