public class Palindrome {
    public static boolean isPalindrome1(String str[], int left, int right) {
        if (left == right)
            return true;
        if (str[left] == " ") {
            return isPalindrome1(str, left + 1, right);
        }
        if (str[right] == " ") {
            return isPalindrome1(str, left, right - 1);
        }
        if (str[left] >= 'A' && str[left] <= 'Z') {
            str[left] = 'a' + str[left] - 'A';
        }
        if (str[right] >= 'A' && str[right] <= 'Z') {
            str[right] = str[right] - 'A' + 'a';
        }
        if (str[left] != str[right]) {
            return false;
        }
        return isPalindrome1(str, left + 1, right - 1);

    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

}
