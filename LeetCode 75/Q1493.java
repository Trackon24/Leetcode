class Solution {
    public int longestSubarray(int[] nums) {
        int count=0,zerocount=0,left=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=1)count++;
        }
        if(count==0) return nums.length-1;
        
        for(int right=0;right<nums.length;right++){
            if(nums[right]==0)zerocount++;
            while(zerocount>1){
                if(nums[left]==0)zerocount--;
                left++;
            }
            max=Math.max(max,right-left);
        }
        return max;
    }
}