

public class NcontinuesNumber {
    public static void printNContinuesNumber(int n, int m) {
        if (n > m) {
            return;
        }
        System.out.print(+n);
        printNContinuesNumber(n + 1, m);
    }

    public static void main(String args[]) {

        printNContinuesNumber(1, 10);

    }
}