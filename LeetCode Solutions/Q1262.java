class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        int or=20000;
        int tr=20000;
        for(int i:nums){
            sum+=i;
            if(i%3==1){
                tr=Math.min(tr,or+i);
                or=Math.min(or,i);
            }
            if(i%3==2){
                or=Math.min(or,tr+i);
                tr=Math.min(tr,i);
            }
        }
        if(sum%3==0)return sum;
        else if(sum%3==1)return sum-or;
        else if(sum%3==2)return sum-tr;
        return 0;
    }
}
