class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        int[] a=new int[spells.length];
        for(int i=0;i<spells.length;i++){
            int low=0;
            int high=potions.length-1;
            int idx=potions.length;
            while(low<=high){
                int mid=low+(high-low)/2;
                if((long)potions[mid]*spells[i]>=success){
                    idx=mid;
                    high=mid-1;
                }
                else low=mid+1;
            }
            a[i]=potions.length-idx;
        }
        return a;
    }
}