class Solution {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6};
        int[] sol = twoSum(nums,6);
        System.out.println(sol);
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                 return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}