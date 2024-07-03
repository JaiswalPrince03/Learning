// package Pattern;

public class numbersPattern {
    public static void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = 1; j <= (2 * (i - 1) - 1); j++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                if (i == 1) {
                    continue;
                }
                System.out.print(l);
            }

            System.out.println();
        }
        for(int i=n-1;i>=1;i--){
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int j = 1; j <= (2 * (i - 1) - 1); j++) {
                System.out.print(" ");
            }
            for (int l = i; l >= 1; l--) {
                if (i == 1) {
                    continue;
                }
                System.out.print(l);
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 4;
        Pattern(n);

    }

}
