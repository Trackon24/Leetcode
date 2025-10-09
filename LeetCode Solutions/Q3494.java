class Solution {

    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;
        long[] times = new long[n+1];

        for(int j=0;j<mana.length;++j){
            for(int i=0;i<skill.length;++i){
                times[i+1]=Math.max(times[i+1],times[i])+(long)skill[i]*mana[j];
            }
            for(int i=n-1;i>0;--i){
                times[i]=times[i+1]-(long)skill[i]*mana[j];
            }
        }
        return times[n];
    }
}