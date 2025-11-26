class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[nums.length];
        int j=0;
        for(int i=0;i<nums.length;i=i+2){
            ans[i]=nums[j++];
        }
        j=n;
        for(int i=1;i<nums.length;i=i+2){
            ans[i]=nums[j++];
        }
        return ans;
    }
}