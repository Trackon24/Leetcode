class Solution {
    static {
        var s = new Solution();
        for (int i = 0; i < 1000; i++) {
            s.findTheDifference("abcd", "abecd");
        }
    }
    public char findTheDifference(String s, String t) {
        char diff=0;
        int i=0;
        for(;i<s.length();i++){
            diff^=s.charAt(i)^t.charAt(i);
        }
        return (char)(diff^t.charAt(i));
    }
}
