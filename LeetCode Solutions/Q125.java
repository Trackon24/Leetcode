class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
        while(left<right){
            char lchar=s.charAt(left);
            if(!isAlphaNumeric(lchar)){
                left++;
                continue;
            }
            char rchar=s.charAt(right);
            if(!isAlphaNumeric(rchar)){
                right--;
                continue;
            }
            lchar=toLowercase(lchar);
            rchar=toLowercase(rchar);
            left++;
            right--;
            if(lchar!=rchar)return false;
        }
        return true;
    }
    private boolean isAlphaNumeric(char c){
        return((c>='a' && c<='z')||(c>='A' && c<='Z')||(c>='0' && c<='9'));
    }
    private static final int LOWERCASE_CONVERSION = 'A' - 'a';

     private char toLowercase(char alphanumericChar) {
        if (alphanumericChar >= 'A' && alphanumericChar <= 'Z') {
            return (char) (alphanumericChar - LOWERCASE_CONVERSION);
        }
        return alphanumericChar;
     }
}