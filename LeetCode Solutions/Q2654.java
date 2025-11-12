class Solution {
    private int gcd(int a,int b){
        if(b==0)return a;
        else return gcd(b,a%b);
    }
    public int minOperations(int[] nums) {
        int ones=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1)ones++;
        }
        if(ones>0)return nums.length-ones;
        int fullgcd=nums[0];
        for(int i=1;i<nums.length;i++){
            fullgcd=gcd(fullgcd,nums[i]);
        }
        if(fullgcd>1)return -1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int g=nums[i];
            for(int j=i+1;j<nums.length;j++){
                g=gcd(g,nums[j]);
                if(g==1){
                    min=Math.min(min,j-i+1);
                    break;
                }
            }
        }
        if(min==Integer.MAX_VALUE)return -1;
        return (min-1)+(nums.length-1);
    }
}