class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l=m+n;
        int[] merged=new int[l];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                merged[k++]=nums2[j++];
            }
            else if(nums1[i]<nums2[j]){
                merged[k++]=nums1[i++];
            }
            else if(nums1[i]==nums2[j]) {
                merged[k++]=nums1[i++];
                merged[k++]=nums2[j++];
                
            }
        }
        while(i<m){
            merged[k++]=nums1[i++];
        }
        while(j<n){
            merged[k++]=nums2[j++];
        }
        for(i=0;i<merged.length;i++){
            nums1[i]=merged[i];
        }
    }
}