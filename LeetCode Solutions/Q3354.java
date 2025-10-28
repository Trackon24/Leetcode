class Solution {
    public int countValidSelections(int[] nums) {
        int output=0,sum=0;
        int n=nums.length;
        for(int i:nums)sum+=i;
        int half=0;
        for(int i=0;i<n;i++){
            half+=nums[i];
            if(nums[i]==0){
                if(half*2==sum)output+=2;
                else if(Math.abs(sum-2*half)==1)output++;
            }
        }
        return output;
    }
}