class Solution {

    public int minimumPairRemoval(int[] nums) {
        int count=0;
        int n=nums.length;
        while(n>1){
            int minsum=Integer.MAX_VALUE;
            int min=-1;
            boolean increasing=true;
            for(int i=1;i<n;i++){
                if(nums[i-1]+nums[i]<minsum){
                    minsum=nums[i]+nums[i-1];
                    min=i-1;
                }
                if(nums[i-1]>nums[i])increasing=false;
            }
            if(increasing)return count;
            nums[min]=minsum;
            for(int i=min+1;i<nums.length-1;i++)nums[i]=nums[i+1];
            count++;
            n--;
        }
        return count;
    }
}