public class hallowHour {
    public static void hallow(int n){
        for (int i=1;i<=n; i++){
            for (int j=1; j<=(2*(n-i)+1);j++){
                if(i==1 || j==1|| j==2*(n-i)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (int i=n;i>=1; i--){
            for (int j=1; j<=2*(n-i)+1;j++){
                if(i==1 || j==1|| j==2*(n-i)+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        hallow(n);
    }
    
}
