class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num=0;num<nums.length;num++) {
            if (nums[num] <= first) {
                first = nums[num];
            } else if (nums[num] <= second) {
                second = nums[num];
            } else {
                return true;
            }
        }
        return false;
    }
}