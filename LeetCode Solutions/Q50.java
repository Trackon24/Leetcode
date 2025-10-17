class Solution {
    public double myPow(double x, int n) {
        double pow=1.0;
        long exp=n;
        if(exp<0){
            x=1/x;
            exp= -exp;
        }
        while(exp>0){
            if(exp%2==1)pow*=x;
            x*=x;
            exp/=2;
        }
        return pow;
    }
}