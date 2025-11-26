class Solution {
    public int smallestRepunitDivByK(int K) {
        if(K%2==0 || K%5==0)return -1;
        int i=1%K, j=1;
        while(i!=0){
            i=(i*10+1)%K;
            j++;
        }
        return j;
    }
}