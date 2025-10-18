class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        if(nums.length<=(2*k)+1)return nums.length;
        int count=0;
        int prev=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int num:nums){
            int curr=Math.max(num-k,prev+1);
            if(curr<=num+k){
                count++;
                prev=curr;
            }
        }
        return count;
    }
}