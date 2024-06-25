public class Nstairs {
    public static int check(int num) {
        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        } else {
            int sum = check(num - 1) + check(num - 2);

            return sum;
        }
    }

    public static void main(String[] args) {
        int num = 2;
        int result = check(num);
        System.out.println("Fibonacci of " + num + " is " + result);
    }
    
}
