class Solution {
    public int maxVowels(String s, int k) {
      int curr=0;
      int left=0;
      int vowels=0;
      int max=0;
      char[] word=s.toCharArray();
      for(int i=0;i<word.length;i++){
        curr++;
        if(word[i]=='a'||word[i]=='e'||word[i]=='i'||word[i]=='o'||word[i]=='u'){
            vowels++;
        }
        while(curr>k){
            if(word[left]=='a'||word[left]=='e'||word[left]=='i'||word[left]=='o'||word[left]=='u'){
                vowels--;
            }
            left++;
            curr--;
        }
        max=Math.max(max,vowels);
      }
      return max;
    }
}