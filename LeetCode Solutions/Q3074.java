class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        reverse(capacity);
        int sum=0;
        int count=0;
        for(int i:apple)sum+=i;
        int csum=0,i=0;
        while(csum<sum){
            csum+=capacity[i++];
            count++;
        }
        return count;
    }
    private static void reverse(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        }
    }
}