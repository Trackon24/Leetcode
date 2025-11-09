class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lmax=height[l];
        int rmax=height[r];
        int trap=0;
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                trap+=lmax-height[l];
            }
            else{
                r--;
                rmax=Math.max(rmax,height[r]);
                trap+=rmax-height[r];
            }
        }   
        return trap;  
    }
}