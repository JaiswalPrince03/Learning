public class PrimeRecursion {
    public static void isPrime(int num, int i) {
        if (num <= 1) {
            System.out.println("Not Prime");
            return;
        }
        if (num % i == 0) {
            System.out.println("Not Prime");
            return;
        }
        if (i * i > num) {
            System.out.println("Prime");
            return;
        }
        isPrime(num, i + 1);
    }

    

    

    public static void main(String[] args) {
        int num = 8;
        isPrime(num, 2);
    }
}
