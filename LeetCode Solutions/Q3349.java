class Solution {

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n=nums.size();
        int count=1;
        int precount=0;
        int ans=0;
        for(int i=1;i<n;i++){
            if(nums.get(i)>nums.get(i-1))count++;
            else{
                precount=count;
                count=1;
            }
            ans=Math.max(ans, Math.min(precount,count));
            ans=Math.max(ans, count/2);
        }
        return ans>=k;
    }
}