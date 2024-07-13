// package CodeForce;
import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String n = scanner.nextLine();
    
            if (n.length() == 1) {
                System.out.println(0);
                return;
            }
    
            int count = 0;
            
            while (n.length() > 1) {
                int sum = 0;
                for (int i = 0; i < n.length(); i++) {
                    sum += Character.getNumericValue(n.charAt(i));
                }
                n = String.valueOf(sum);
                count++;
            }
    
            System.out.println(count);
        }
    }
}
