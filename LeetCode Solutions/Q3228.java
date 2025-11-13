class Solution {
    public int maxOperations(String s) {
        int i=s.length()-1;
        int counto=0;
        int count=0;
        while(i>=0){
            while(s.charAt(i)=='1'){
                i--;
                count+=counto;
                if(i<0)return count;
            }
            while(s.charAt(i)=='0'){
                i--;
                if(i<0)return count;
            }
            counto++;
        }
        return count;
    }
}