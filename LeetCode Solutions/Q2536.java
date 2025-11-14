class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] q=new int[n][n];
        for(int i=0;i<queries.length;i++){
            q[queries[i][0]][queries[i][1]]+=1;
            if(queries[i][3]<n-1)q[queries[i][0]][queries[i][3]+1]-=1;
            if(queries[i][2]<n-1){
                q[queries[i][2]+1][queries[i][1]]-=1;
                if(queries[i][3]<n-1)q[queries[i][2]+1][queries[i][3]+1]+=1;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n;j++)q[i][j]+=q[i][j-1];
        }
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++)q[i][j]+=q[i-1][j];
        }
        return q;
    }
}