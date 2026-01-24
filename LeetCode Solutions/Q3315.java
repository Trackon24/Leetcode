class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        for(int i=0;i<nums.size();i++){
            int a=nums.get(i);
            int cons=-1;
            int check=1;
            while((a&check)!=0){
                cons=a-check;
                check<<=1;
            }
            ans[i]=cons;
        }
        return ans;
    }
}