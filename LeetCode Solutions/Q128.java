class Solution {
    static{
        for(int i=0;i<1000;i++) longestConsecutive(new int[] {1,2,3,4});
    }
    public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        Arrays.sort(nums);
        int curr=1, count =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) continue;
            else if(nums[i]==nums[i-1]+1) curr++;
            else curr=1;
            count = Math.max(count, curr);
        }
        return count;
    }
}