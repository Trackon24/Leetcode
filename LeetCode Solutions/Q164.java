class Solution {

    private static final int NUM_DIGITS = 10;

    public int maximumGap(int[] nums) {
        int n = nums.length;
        int res = 0;

        if (n < 2) return 0;

        radixSort(nums);

        for (int i = 0; i < n - 1; i++) {
            res = Math.max(res, nums[i + 1] - nums[i]);
        }

        return res;
    }

    public void countingSort(int[] arr, int placeVal) {
        int[] counts = new int[NUM_DIGITS];
        for (int elem : arr) {
            int current = elem / placeVal;
            counts[current % NUM_DIGITS] += 1;
        }
        int startingIndex = 0;
        for (int i = 0; i < counts.length; i++) {
            int count = counts[i];
            counts[i] = startingIndex;
            startingIndex += count;
        }

        int[] sortedArray = new int[arr.length];
        for (int elem : arr) {
            int current = elem / placeVal;
            sortedArray[counts[current % NUM_DIGITS]] = elem;
            counts[current % NUM_DIGITS] += 1;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArray[i];
        }
    }

    public void radixSort(int[] arr) {
        int maxElem = Integer.MIN_VALUE;
        for (int elem : arr) {
            if (elem > maxElem) {
                maxElem = elem;
            }
        }

        int placeVal = 1;
        while (maxElem / placeVal > 0) {
            countingSort(arr, placeVal);
            placeVal *= 10;
        }
    }
}