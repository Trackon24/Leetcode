class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n=nums.length;
        int[] count=new int[101];
        for(int i=0;i<n;i++){
            count[nums[i]]++;
        }
        int max=count[0];
        for(int i=1;i<101;i++){
            if(count[i]>max){
                max=count[i];
            }
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(count[i]==max){
                sum+=count[i];
            }
        }
        return sum;
    }
}