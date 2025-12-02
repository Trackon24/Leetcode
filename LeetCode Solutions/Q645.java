class Solution{
public static int[] findErrorNums(int[] nums) {
        int[] a=new int[2];
        int[] count=new int[nums.length+1];
        for(int i:nums)count[i]++;
        for(int i=1;i<count.length;i++){
            if(count[i]==2)a[0]=i;
            if(count[i]==0)a[1]=i;
        }
        return a;
    }
}