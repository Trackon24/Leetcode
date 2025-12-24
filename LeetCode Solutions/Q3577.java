class Solution {
    public int countPermutations(int[] complexity) {
        int n=complexity.length;
        int MOD = (int) 1e9 + 7;
        int root=complexity[0];
        for(int i=1;i<n;i++){
            if(complexity[i]<=root)return 0;
        }
        long result=1;
        for(int i=1;i<n;i++)result=(result*i)%MOD;
        return (int) result;
    }
}