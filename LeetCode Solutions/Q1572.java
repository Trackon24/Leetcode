class Solution {
    public int diagonalSum(int[][] mat) {
        int x=mat.length;
        int sum=0;
        for(int i=0;i<x;i++){
            sum+=mat[i][i];
            sum+=mat[i][x-i-1];
        }
        if(x%2==1){
            sum-=mat[x/2][x/2];
        }
        return sum;
    }
}