public class wealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[] accounts){
        for(int person = 0;person<accounts.length;person++){
            int sum=0;
            for(int account=0;account<accounts[person].length;account++){
                sum+=accounts[person][account];
            }
        }
    }
}
