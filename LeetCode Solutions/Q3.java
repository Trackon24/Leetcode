public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0||s.length()==1)return s.length();
        int l=0;
        int r=0;
        int max=1;
        int[] count=new int[128];
        for(int i=0;i<128;i++){
            count[i]=-1;
        }
        while(r<s.length()){
            char c=s.charAt(r);
            if(count[c]>=l)l=count[c]+1;
            count[c]=r;
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}