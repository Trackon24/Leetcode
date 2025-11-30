class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum=0;
        for (int num:nums) sum+=num;

        int rem=(int)(sum%p);
        if (rem==0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        long subsum=0;
        int len=nums.length;

        for (int i=0; i<nums.length; i++) {
            subsum=(subsum+nums[i]) % p;

            int needed=(int)((subsum-rem+p)%p);
            if (map.containsKey(needed))
                len=Math.min(len, i-map.get(needed));

            map.put((int)subsum, i);  
        }

        return len==nums.length?-1:len;
    }
}
