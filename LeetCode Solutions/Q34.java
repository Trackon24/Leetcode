class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] index=new int[2];
        index[0]=-1;
        index[1]=-1;
        int low=0, high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target)high=mid-1;
            else low=mid+1;
            if(nums[mid]==target)index[0]=mid;
        }
        low=0;
        high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<=target)low=mid+1;
            else high=mid-1;
            if(nums[mid]==target)index[1]=mid;
        }
        return index;
    }
}