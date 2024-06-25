public class longWords {

    public static void main(String[] args) {
        String str = "localization";
        if (str.length() >= 10) {
            int n = str.length();

            // First character of a string
            char first = str.charAt(0);

            // Last character of a string
            char last = str.charAt(n - 1);
            System.out.println("First: " + first + "count" +(str.length() - 2) +"last " + last);

        } else {
            System.out.println("Length is less than 10");
        }
    }

}
