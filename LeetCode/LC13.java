public class LC13 {
    // public int romanToInt(String s) {
    //     int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    //     String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    //     int result = 0;
    //     int i = 0;
    //     while (i < s.length()) {
    //         for (int j = 0; j < symbols.length; j++) {
    //             if (s.startsWith(symbols[j], i)) {
    //                 result += values[j];
    //                 i += symbols[j].length();
    //                 break;
    //             }
    //         }
    //     }
    //     return result;
        
    // }
    // public static void main(String[] args) {
    //     LC13 lc13 = new LC13();
    //     System.out.println(lc13.romanToInt("MCMXCIV"));
    // }



    class Solution {


        public static int value(char ch){
    
            switch (ch) {
                case 'I': return 1;
                case 'V': return 5;
                case 'X': return 10;
                case 'L': return 50;
                case 'C': return 100;
                case 'D': return 500;
                case 'M': return 1000;
                default : return 0;
                    
            }
           
            
        }
    
        public int romanToInt(String s) {
            int n=s.length();
            int sum=0;
            for(int i=0;i<n;i++){
                char ch1=s.charAt(i);
    
                if((i+1)<n && value(ch1)< value(s.charAt(i+1))){
                    sum=sum-value(ch1);
                }
                else{
                    sum=sum+value(ch1);
                }
            }
    
            return sum;
            
    
            
        }
    }
}
