public class Tribonacci {
    public static int check(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        } else

        {
            int sum = check(num - 1) + check(num - 2) + check(num - 3);

            return sum;
        }
    }

    public static void main(String[] args) {
        int num = 8;
        int result = check(num);
        System.out.println("Tribonacci of " + num + " is " + result);
    }
}
