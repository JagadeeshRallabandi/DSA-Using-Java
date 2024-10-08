public class EvenDigits {
    public static void main(String[] args) {
        int [] nums = {18,24,99,1764,98,1};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
     int numberofDigits=digits2(num);
        return numberofDigits % 2 == 0;
    }
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num)+1);
    }
    static int digits(int num){
        if(num<0){
            num=num*-1;
        }
        if(num==0){
            return 1;
        }
        int count = 0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
