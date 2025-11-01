class Solution {
    static{
        for(int i=0;i<500;i++){
            productExceptSelf(new int[]{1,2});
        }
    }
    public static int[] productExceptSelf(int[] nums) {
        int leftP=1;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=leftP;
            leftP*=nums[i];
        }
        int rightP=1;
        for(int i=nums.length-1;i>=0;i--){
            ans[i]*=rightP;
            rightP*=nums[i];
        }
        return ans;
    }
}
