public class Sumofn {
    public static void main(String[] args) {
        int ans=sum(1234);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n/10)+n%10;
    }
}