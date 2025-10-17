class Solution {
    List<String> result=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        StringBuilder res=new StringBuilder();
        backtrack(res,0, 0, n);
        return result;
    }
    public void backtrack(StringBuilder str, int open, int close, int max){
        if(str.length()==max*2){
            result.add(str.toString());
            return;
        }
        if(open<max){
            str.append("(");
            backtrack(str,open+1,close,max);
            str.deleteCharAt(str.length()-1);
        }
        if(close<open){
            str.append(")");
            backtrack(str,open, close+1, max);
            str.deleteCharAt(str.length()-1);
        }
    }
}