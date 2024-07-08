public class LC58 {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        int count = 0;
        for (int i = right; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            } else {
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        LC58 l = new LC58();
        System.out.println(l.lengthOfLastWord("Hello World"));
    }

}
