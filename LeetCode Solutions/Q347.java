class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        int range = max - min + 1;
        int[] count = new int[range];
        for (int num : nums) count[num - min]++;

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            int maxIdx = 0;
            for (int j = 1; j < count.length; j++) {
                if (count[j] > count[maxIdx])
                    maxIdx = j;
            }
            res[i] = maxIdx + min; 
            count[maxIdx] = 0;    
        }

        return res;
    }
}
