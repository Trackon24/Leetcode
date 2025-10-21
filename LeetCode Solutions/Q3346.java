class Solution {
    public int maxFrequency(int[] nums, int k, int numOperations) {
        int maxval=Arrays.stream(nums).max().getAsInt()+k+2;
        int[] count=new int[maxval];
        for(int i:nums)count[i]++;
        for(int i=1;i<maxval;i++)count[i]+=count[i-1];
        int res=0;
        for(int i=0;i<maxval;i++){
            int left=Math.max(0, i-k);
            int right=Math.min(maxval-1,i+k);
            int total=count[right]-(left>0?count[left-1]:0);
            int freq=count[i]-(i>0?count[i-1]:0);
            res=Math.max(res,freq+Math.min(numOperations,total-freq));
        }
        return res;
    }
}