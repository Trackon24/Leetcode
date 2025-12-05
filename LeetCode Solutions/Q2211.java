class Solution {
    public int countCollisions(String s) {
        int i=0,j=s.length()-1;
        char[] st=s.toCharArray();
        while(i<st.length && st[i]=='L')i++;
        while(j>=0 && st[j]=='R')j--;
        int c=0;
        for(int k=i;k<=j;k++){
            if(st[k]!='S')c++;
        }
        return c;
    }
}
