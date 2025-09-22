class Solution {
    public int maxOperations(int[] nums, int k) {
        int count=0;
        int newn=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<k){
                nums[newn++]=nums[i];
            }
        }
        Arrays.sort(nums,0,newn);
        int i=0;
        int j=newn-1;
        while(i<j){
           int sum=nums[i]+nums[j];
           if(sum==k){
            i++;
            j--;
            count++;
           }
           else if(sum<k){
            i++;
           }
           else j--;
        }
        return count;
    }
}