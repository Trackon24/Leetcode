class Solution {
    public int longestOnes(int[] nums, int k) {
        int zerocount=0,left=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
                zerocount++;
            while(zerocount>k){
                if(nums[left]==0){
                    zerocount--;
                }
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}