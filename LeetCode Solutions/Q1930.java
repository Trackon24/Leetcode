class Solution {
    public int countPalindromicSubsequence(String s) {
        int n = s.length();
        if(n<3)return 0;
        int ans = 0;
        char str[]=s.toCharArray();
        int[] first=new int[26];
        int[] last=new int[26];
        Arrays.fill(first,n);
        Arrays.fill(last,-1);
        for(int i=0;i<n;i++){
            int c=str[i]-'a';
            if(first[c]==n)first[c]=i;
            last[c]=i;
        }
        for(int i=0;i<26;i++){
            int f=first[i];
            int l=last[i];
            if(f<l){
                boolean[] seen=new boolean[26];
                for(int j=f+1;j<=l-1;j++){
                    seen[str[j]-'a']=true;
                }
                for(int j=0;j<26;j++){
                    if(seen[j])ans++;
                }
            }
        }
        return ans;
    }
}
