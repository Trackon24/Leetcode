class Solution {
    public int largestPerimeter(int[] nums) {
        int temp=0;
       for (int i = 0; i < nums.length; i++) {
        for (int j = 0; j < nums.length-1-i; j++) {
            if(nums[j]>nums[j+1])
            {
                temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;
            }
           
        
            
        }
         if(i>=2)
            {
                if(nums[nums.length-i+1]<nums[nums.length-i-1]+nums[nums.length-i])
                {
                    return nums[nums.length-i+1]+nums[nums.length-i-1]+nums[nums.length-i];
                }
            }
        } return 0;
    }
}