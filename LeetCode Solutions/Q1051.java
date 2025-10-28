class Solution {
    public int heightChecker(int[] heights) {
        int[] expected=new int[101];
        for(int i=0;i<heights.length;i++)expected[heights[i]]++;
        int index=0, output=0;
        for(int i=1;i<=100;i++){
            while(expected[i]>0){
                if(heights[index]!=i)output++;
                index++;
                expected[i]--;
            }
        }
        return output;
    }
}