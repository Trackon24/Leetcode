class Solution {
    public String removeStars(String s) {
        char[] result = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == '*'){
                j--;
                continue;
            }
            result[j++]=ch;
        }
        return new String(result,0,j);
    }
}