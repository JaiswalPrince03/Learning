public class reverseNumber {
    public static void Number(int n, int m ){
        if (n<m){
            return;
        }
        System.out.print(+n);
        Number(n-1, m);
    }
    public static void main(String[] args) {
        Number(10, 1);
    }
    
}
