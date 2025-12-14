class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minsum=0;
        int maxsum=0;
        for(int i=0;i<k;i++)minsum+=nums[i];
        for(int i=nums.length-1;i>nums.length-k-1;i--)maxsum+=nums[i];
        return maxsum-minsum;
    }
}