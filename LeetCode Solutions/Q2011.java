class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int ans=0;
        for(String op:operations){
            if(op.contains("+")){
                ans++; 
            }
            else {
                ans--;
            }
        }
        return ans;
    }
}