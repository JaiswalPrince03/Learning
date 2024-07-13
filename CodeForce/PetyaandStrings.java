// package CodeForce;
import java.util.*;

public class PetyaandStrings {
    public static void comp(String s, String t) {
        int compare = s.compareToIgnoreCase(t);
            
        if(compare > 0){
            System.out.println("1");
        }else if (compare < 0){
            System.out.println("-1");
        }else{
            System.out.println("0");
        }
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();

            String t = scanner.nextLine();
            comp(s, t);
        }
    }
}
