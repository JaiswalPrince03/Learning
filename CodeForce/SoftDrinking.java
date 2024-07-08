// package CodeForce;

import java.util.Scanner;

public class SoftDrinking {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Read input values
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
 
        // Calculate total resources
        int totalDrink = k * l; // Total milliliters of drink
        int totalLimes = c * d; // Total slices of lime
        int totalSalt = p; // Total grams of salt
 
        // Calculate maximum possible toasts from each resource
        int maxToastsFromDrink = totalDrink / nl;
        int maxToastsFromLimes = totalLimes;
        int maxToastsFromSalt = totalSalt / np;
 
        // Determine the limiting factor
        int maxToasts = Math.min(maxToastsFromDrink, Math.min(maxToastsFromLimes, maxToastsFromSalt));
 
        // Calculate number of toasts per friend
        int toastsPerFriend = maxToasts / n;
 
        // Output the result
        System.out.println(toastsPerFriend);
 
        sc.close();
    }
    
}
