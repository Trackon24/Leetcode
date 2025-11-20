class Solution {
    public int intersectionSizeTwo(int[][] intervals) {
        Arrays.sort(intervals, (x,y)->x[1]==y[1]?y[0]-x[0]:x[1]-y[1]);
        int x=-1,y=-1;
        int count=0;
        for(int[] interval:intervals){
            int start=interval[0],end=interval[1];
            if(start>y){
                x=end-1;
                y=end;
                count+=2;
            }
            else if(start>x){
                x=y;
                y=end;
                count+=1;
            }
        }
        return count;
    }
}