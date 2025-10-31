class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i:nums)max=Math.max(max, i);
        int[] res=new int[2];
        int[] count=new int[max+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]++;
        }
        int idx=0;
        for(int j=0;j<count.length;j++){
            if(count[j]==2)res[idx++]=j;
            if(idx==2)break;
        }
    return res;
    }
}