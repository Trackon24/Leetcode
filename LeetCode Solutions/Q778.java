class Solution {
    private static final int[][] dir={{1,0},{-1,0},{0,-1},{0,1}};
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int left=grid[0][0];
        int right=n*n-1;
        
        while(left<right){
            boolean[][] visited=new boolean[n][n];
            int mid=left+(right-left)/2;
            if(canReach(grid, 0, 0, mid, visited))
                right=mid;
            else
            left=mid+1;
        }
        return left;
    }
    public boolean canReach(int[][] grid, int x, int y, int t, boolean[][] visited){
        int n=grid.length;
        if(x<0||x>=n||y<0||y>=n||visited[x][y]||grid[x][y]>t)
            return false;
        if(x==n-1 && y==n-1)
            return true;
        visited[x][y]=true;
        for(int[] d:dir){
            int nx=x+d[0];
            int ny=y+d[1];
            if(canReach(grid, nx, ny, t, visited))
                return true;
        }
        return false;
    }
}