public class Q1672 {
    public int maximumWealth(int[][] accounts) {
       int max=0;
       int rowLength=accounts.length;
       int colLength=accounts[0].length;

       for(int i=0;i<rowLength;i++){
        int sum=0;
        for(int j=0;j<colLength;j++){
            sum+=accounts[i][j];
        }
        max=Math.max(max,sum);
       }
       return max;
    }
} 