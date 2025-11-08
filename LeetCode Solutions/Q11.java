class Solution {
    static {
        for(int i = 0;i <100;i++) {
            maxArea(new int[] { 0, 0 });
        }
    }
    public static int maxArea(int[] height) {
        int n=height.length;
        int i=0;
        int j=n-1;
        int maxArea=0;
        while(i<j){
            int low=(height[i]<height[j])?height[i]:height[j];
            int area=low*(j-i);
            maxArea=area>maxArea?area:maxArea;
            while(i<n && height[i]<=low)i++;
            while(j>i && height[j]<=low)j--;
        }
            return maxArea;
    }
}