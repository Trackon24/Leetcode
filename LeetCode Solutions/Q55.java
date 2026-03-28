class Solution {
    public boolean canJump(int[] nums) {
        int res=nums.length-1;
        for(int i=nums.length-2;i>=0;i--){
            if(i+nums[i]>=res)res=i;
        }
        return res==0;
    }
}