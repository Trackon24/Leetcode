class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxArea=0;
        while(i<j){
            if(height[i]<height[j]){
                if(maxArea<height[i]*(j-i)) maxArea=height[i]*(j-i);
                i++;
            }
            else{
                if(maxArea<height[j]*(j-i)) maxArea=height[j]*(j-i);
                j--;
            }
        }
        return maxArea;
    }
}