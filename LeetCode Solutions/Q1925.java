class Solution {
    public int countTriples(int n) {
        int count=0;
        boolean[] present=new boolean[n*n+1];
        for(int i=1;i<=n;i++)present[i*i]=true;
        for(int i=1;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                int sq=((i*i)+(j*j));
                if((sq)>n*n)break;
                if(present[sq])count+=2;
            }
        }
        return count;
    }
}