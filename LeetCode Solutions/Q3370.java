class Solution {
    public int smallestNumber(int n) {
        int ans=0;
        for(int i=0;i<11;i++){
            if((1<<i)>n){
                ans=(1<<i)-1;
                break;
            }
        }
        return ans;
    }
}