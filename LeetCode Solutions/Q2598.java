class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        for(int i=0;i<nums.length;i++){
            nums[i]=((nums[i]%value)+value)%value;
            }
        int[] count=new int[value];
        for(int num:nums)count[num]++;
        int i=0;
        while(true){
            if(count[i%value]==0)break;
            count[i%value]--;
            i++;
        }    
        return i;
    }
}