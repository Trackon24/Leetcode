class Solution {
    public int totalMoney(int n) {
        int res=0;
        int weeks=n/7;
        int days=n%7;
        for(int i=0;i<weeks;i++)res+=28+(7*i);
        for(int i=1;i<=days;i++)res+=weeks+i;
        return res;
    }
}