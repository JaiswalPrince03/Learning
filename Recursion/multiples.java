public class multiples {
    public static void Mtp(int n, int m) {
        if (n == 0) {
            return;
        }
        System.out.print(m);
        Mtp(n - 1, m + 3);
      
    }

    public static void main(String[] args) {
        Mtp(5, 3);
    }

}
