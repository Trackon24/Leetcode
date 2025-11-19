class Solution {
    public int findFinalValue(int[] nums, int original) {
        boolean found=true;
        while(found){
            found=isPresent(nums,original);
            original*=2;
        }
        
        return original/2;
    }
    private boolean isPresent(int[] num,int orig){
        for(int i=0;i<num.length;i++){
                if(num[i]==orig){
                    return true;
                }
        }
        return false;
    }
}