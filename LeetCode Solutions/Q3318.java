class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n=nums.length;
        int[] res=new int[n-k+1];
        for(int i=0;i<n-k+1;i++){
            int[] freq=new int[51];
            int maxFreq=0;
            for(int j=i;j<i+k;j++){
                freq[nums[j]]++;
                maxFreq=Math.max(maxFreq,freq[nums[j]]);
            }
            int sum=0,count=0;
            for(int f=maxFreq;f>=1 && count<x;f--){
                for(int v=50;v>=1 && count<x;v--){
                    if(freq[v]==f){
                        sum+=v*f;
                        count++;
                    }
                }
            }
            res[i]=sum;
        }
        return res;
    }
}