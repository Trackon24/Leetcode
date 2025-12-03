class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String t:tokens){
            if(t.equals("+"))st.push(st.pop()+st.pop());
            else if(t.equals("-")){
                int s=st.pop();
                int f=st.pop();
                st.push(f-s);
            }
            else if(t.equals("*"))st.push(st.pop()*st.pop());
            else if(t.equals("/")){
                int s=st.pop();
                int f=st.pop();
                st.push(f/s);
            }
            else st.push(Integer.parseInt(t));
        }
        return st.peek();
    }
}