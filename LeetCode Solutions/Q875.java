class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        for(int i=0;i<piles.length;i++){
            high=Math.max(high,piles[i]);
        }
        while(low<high){
            int k=low+(high-low)/2;
            int sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=(piles[i]+k-1)/k;
            }
            if(sum>h) low=k+1;
            else high=k;
        }
        return high;
    }
}