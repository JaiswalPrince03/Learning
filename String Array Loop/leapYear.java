public class leapYear {

    public static void Year(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0) && (n % 2000 != 0)) {
            System.out.println(n + " is a leap n.");
        } else {
            System.out.println(n + " is not a leap Year.");
        }
    }

    public static void main(String[] args) {
        int n = 1600;
        Year(n);

    }
}
