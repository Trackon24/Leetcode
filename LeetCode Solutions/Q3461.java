class Solution {
    public boolean hasSameDigits(String s) {
        int[] c=new int[s.length()];
        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i)-'0';
        }
        for(int j=c.length;j>2;j--){
            for(int i=0;i<j-1;i++){
                c[i]=(c[i]+c[i+1])%10;
            }
        }
        return (c[0]==c[1]);
    }
}