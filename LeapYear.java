public class LeapYear {
    public static void main(String[] args) {
        int year = 2000; // Example year to check

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(year + " is " + (isLeapYear ? "a leap year." : "not a leap year."));
    }
}
