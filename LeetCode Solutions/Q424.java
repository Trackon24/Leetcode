class Solution {
    public static int characterReplacement(String s, int k) {
        int i=0,j=0;
        int len=0;
        int freqmax=0;
        int[] freq=new int[26];
        for(j=0;j<s.length();j++){
            freq[s.charAt(j)-'A']++;
            freqmax=Math.max(freqmax,freq[s.charAt(j)-'A']);
            int winlen=j-i+1;
            if(winlen-freqmax>k){
                freq[s.charAt(i)-'A']--;
                i++;
            }
            winlen=j-i+1;
            len=Math.max(len,winlen);
        }
        return len;
    }
}