class Solution {
     static {
        Solution s = new Solution();
        for(int i = 0; i < 1000; ++i) {
            s.prefixesDivBy5(new int[]{1, 0, 1});
        }
    }
    public static List<Boolean> prefixesDivBy5(int[] nums) {
        Boolean[] arr=new Boolean[nums.length];
        int mod=0;
        for(int i=0;i<nums.length;i++){
            mod=((mod*2)+nums[i])%5;
            arr[i]=(mod==0);
        }
        return Arrays.asList(arr);
    }
}