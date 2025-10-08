class Solution {
    public boolean isSubsequence(String s, String t) {
        int m=s.length();
        int i=0;
        int j=0;
        int n=t.length();
        while(i<m){
            char currs=s.charAt(i);
            while(j<n && t.charAt(j)!=currs){
                j++;
            }
            if(j==n) return false;
            i++;
            j++;
        }
        return true;
    }
}