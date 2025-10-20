class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length, n=nums2.length;
        if(m>n)return findMedianSortedArrays(nums2,nums1);
        int l=nums1.length+nums2.length;
        int left=0, right=m;
        while(left<=right){
            int mid=(left+right)/2;
            int part=(m+n+1)/2 - mid;
            int left1=(mid==0)?Integer.MIN_VALUE:nums1[mid-1];
            int right1=(mid==m)?Integer.MAX_VALUE:nums1[mid];
            int left2=(part==0)?Integer.MIN_VALUE:nums2[part-1];
            int right2=(part==n)?Integer.MAX_VALUE:nums2[part];
            if(left1<=right2 && left2<=right1){
                if(l%2==0)return(Math.max(left1,left2)+Math.min(right1,right2))/2.0;
                else return (double)Math.max(left1, left2);
            }
            else if(left1>right2){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
     return 0.0;
    }
}