public class LC125 {
    public boolean isPalindrome(String s) {
        if(s == null || s.length() == 0) return true;
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;
        while(left < right) {
            if(!Character.isLetter(s.charAt(left))){
                left++;
            }
            else if(!Character.isLetter(s.charAt(right))) {
                right--;
            }
            else if(s.charAt(left) != s.charAt(right)) {
                return false;
            }
            else {
                left++;
                right--;
            }
        }
        return true;
        
    }
  
    public static void main(String[] args) {
        LC125 l = new LC125();
        System.out.println(l.isPalindrome("A man, a plan, a canal: Panama"));
    }
    
}
