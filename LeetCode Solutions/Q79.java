class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        if (m*n < word.length())
            return false;
        char[] w = word.toCharArray();
        int[] boardf = new int[128];
        for (int i = 0; i < m; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                ++boardf[board[i][j]];
            }
        }
        for (char ch : w)
        {
            if (--boardf[ch] < 0)
            {
                return false;
            }
        }
        if(boardf[w[0]]>boardf[w[w.length-1]])reverse(w);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(w[0]==board[i][j] && found(board, i, j, w, new boolean[m][n], 0))return true;
            }
        }
        return false;
    }
    private void reverse(char[] w){
        int n=w.length;
        for(int i=0;i<n/2;i++){
            char temp=w[i];
            w[i]=w[n-i-1];
            w[n-i-1]=temp;
        }
    }
    private static final int[] dir={0,-1,0,1,0};
    private boolean found(char[][] board, int row, int col, char[] w, boolean[][] visited, int index){
        if(index==w.length)return true;
        if(row<0||col<0||row==board.length||col==board[0].length||board[row][col]!=w[index]||visited[row][col])return false;
        visited[row][col]=true;
        for(int i=0;i<4;i++){
            if(found(board, row+dir[i], col+dir[i+1], w, visited, index+1)) return true;
        }
        visited[row][col]=false;
        return false;
    }
}