public class Pattern2 {
    public static void patt(int n){
        for(int i=n; i>=1; i--){
            // System.out.print("");
            for(int j=i; j>=1; j--){
            System.out.print(j);
        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        int n=4;
        patt(n);
    }
    
}
