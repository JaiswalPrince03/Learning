import java.util.*;

public class sumofdigitisPrime {
    public static boolean isPrime(int sum){
        for(int i=2; i <= sum/2; i++){
            if(sum%i==0){
              return false;
            }
        }
         return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = scanner.nextInt();
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println(sum);
        if(isPrime(sum)){
            System.out.println("Sum of digits is prime number");
            }
            else{
                System.out.println("Sum of digits is not prime number");
                }
        }
    }

