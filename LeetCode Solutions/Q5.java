class Solution {
    public String longestPalindrome(String s) {
        if(s.length()==1)return s;
        String res=s.substring(0,1);
        for(int i=0;i<s.length()-1;i++){
            String a=pal(s,i,i);
            String b=pal(s,i,i+1);
            if(a.length()>res.length())res=a;
            if(b.length()>res.length())res=b;
        }
    return res;
    }
    private String pal(String s, int l, int r){
        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return s.substring(l+1,r);
    }
}