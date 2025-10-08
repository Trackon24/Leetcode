class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int x=numBottles;
        while(numBottles>=numExchange){
            int fill=numBottles/numExchange;
            int left=numBottles%numExchange;
            x=x+fill;
            numBottles=fill+left;
        }
        return x;
    }
}
