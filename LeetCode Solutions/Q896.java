class Solution {
    public boolean isMonotonic(int[] nums) {
        int n=nums.length;
        if(n==1) return true;
        int j=1;
        while(j<n && nums[j]==nums[j-1]) j++;
        if(j<n && nums[j]<nums[j-1]){
            for(int i=j;i<n;i++){
                if(nums[i]>nums[i-1])return false;
            }
        }
        if(j<n && nums[j]>nums[j-1]){
            for(int i=j;i<n;i++){
                if(nums[i]<nums[i-1])return false;
            }
        }
        return true;
    }
}

