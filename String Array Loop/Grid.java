public class Grid {
    public static void pattern(int n){
    int rp =-1;
    for(int i=1;i<2*n;i++){
        if(i%2==0)
        {
            rp=rp*(-1);
        }
        int cp = 1*rp;
        for(int j=1;j<=n;j++){
            if(cp==1){
                System.out.print("##");
            }
            else{
                System.out.print("..");
            }
            cp=cp*(-1);
        }
    System.out.println();}
}

    public static void main(String[] args) {
        int n = 3;
        pattern(n);

    }

}