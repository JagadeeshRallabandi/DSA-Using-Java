public class Main {
    public static void main(String[] args) {
        int[] nums = {23,44,56,32,-1,25,4,-1,-16,-11};
        int target = 25;
        int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr,int target){
        if(arr.length==0){
            return -1;
        }
        for(int index=0;index<arr.length; index++){
            int element = arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}