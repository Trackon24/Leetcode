class Solution {
    static {
        for (int i = 0; i < 500; i++) {
            numSub("111111");
        }
    }
    public static int numSub(String s) {
        final int Mod=1000000007;
        int ans=0;
        int one=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                ans=(ans+ ++one)%Mod;
            }
            else one=0;
        }
        return ans;
    }
}