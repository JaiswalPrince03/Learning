// package CodeForce;

import java.util.Scanner;

public class RomaandLuckyNumbers{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int kp = scanner.nextInt();
            String[] w = new String[n];

            for (int i = 0; i < n; i++) {
                w[i] = scanner.next();
            }

            int d = 0;
            for (int i = 0; i < n; i++) {
                int c = 0;
                for (int j = 0; j < w[i].length(); j++) {
                    if (w[i].charAt(j) == '4' || w[i].charAt(j) == '7') {
                        c++;
                    }
                }
                if (c <= kp) { // Corrected the condition to <= kp
                    d++;
                }
            }

            System.out.println(d); // Corrected to print d instead of n - d
        }
    }
}

