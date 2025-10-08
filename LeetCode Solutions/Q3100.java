class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int count=0;
        int x=numBottles;
        while(numBottles>=numExchange){
            numBottles=(numBottles-numExchange)+1;
            numExchange=numExchange+1;
            count++;
        }
        return x+count;
    }
}
