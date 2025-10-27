class Solution {
    public int numberOfBeams(String[] bank) {
        int ans=0;
        int first=count(bank[0]);
        for(int i=1;i<bank.length;i++){
            int curr=count(bank[i]);
            if(curr==0)continue;
            ans+=first*(first=curr);
        }
        return ans;
    }
    int count(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=s.charAt(i)-'0';
        }
        return c;
    }
}