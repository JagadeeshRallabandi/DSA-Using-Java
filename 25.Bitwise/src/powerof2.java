public class powerof2 {
    public static void main(String[] args) {
        int n=16;
        boolean ans=(n&(n-1))==0;
        if (n==0)
        {
            ans=false;

        }

        System.out.println(ans);
    }
}
