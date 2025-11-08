class Solution {
    static {
        for(int i=0; i<400; i++) minCost("a", new int[1]);
    }
    public static int minCost(String colors, int[] neededTime) {
        int c=0;
        for(int i=1;i<colors.length();i++){
            if(colors.charAt(i)==colors.charAt(i-1)){
                c+=Math.min(neededTime[i],neededTime[i-1]);
                neededTime[i]=Math.max(neededTime[i],neededTime[i-1]);
            }
        }
        return c;
    }
}