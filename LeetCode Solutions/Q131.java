class Solution {
    List<List<String>> res=new ArrayList<>();
    List<String> pal=new ArrayList<>();
    public List<List<String>> partition(String s) {
        int index=0;
        backtrack(s,index);
        return res;
    }
    public void backtrack(String s, int index){
        if(index==s.length()){
            res.add(new ArrayList<>(pal));
            return;
        }
        
        for(int i=index;i<s.length();i++){
            if(isPalindrome(s,index,i)){
                pal.add(s.substring(index,i+1));
                backtrack(s,i+1);
                pal.remove(pal.size()-1);
            }
        }
    }
    private boolean isPalindrome(String s,int l, int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}