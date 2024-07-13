public class Palindrome {
    public static boolean isPalindrome1(String str[], int left, int right) {
        if (left == right)
            return true;
        if (str[left].equals(" ")) {
            return isPalindrome1(str, left + 1, right);
        }
        if (str[right].equals(" ")) {
            return isPalindrome1(str, left, right - 1);
        }
        char leftChar = str[left].charAt(0);
        char rightChar = str[right].charAt(0);
        if (leftChar >= 'A' && leftChar <= 'Z') {
            leftChar = (char)('a' + leftChar - 'A');
        }
        if (rightChar >= 'A' && rightChar <= 'Z') {
            rightChar = (char)(rightChar - 'A' + 'a');
        }
        if (leftChar != rightChar) {
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
