class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] mat=new int[m+1][n+1];
        for(String s:strs){
            int[] c=count(s);
            int zcount=c[0], ocount=c[1];
            for(int i=m;i>=zcount;i--){
                for(int j=n;j>=ocount;j--)
                    mat[i][j]=Math.max(mat[i][j],mat[i-zcount][j-ocount]+1);
            }
        }
        return mat[m][n];
    }
    private int[] count(String s){
        int z=0,o=0;
        for(char c:s.toCharArray()){
            if(c=='0')z++;
            else o++;
        }
        return new int[]{z,o};
    }
}