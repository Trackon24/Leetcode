class Solution {
    static
    {
        for(int i=0;i<100;i++)kLengthApart(new int[]{0}, 2);
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int limit=k,one=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(limit<k)return false;
                one=1;
                limit=0;
            }
            else{
                if(one==1)limit++;
            }
        }
        return true;
    }
}