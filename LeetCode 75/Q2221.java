class Solution {
    public int triangularSum(int[] nums) {
       return trianSum(nums,nums.length);
    }
    public int trianSum(int[] arr, int n){
        if(n==1)return arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=(arr[i]+arr[i+1])%10;
        }
        return trianSum(arr,n-1);
    }
}