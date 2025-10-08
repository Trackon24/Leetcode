public class Solution {
    public int largestAltitude(int[] gain){ 
        int[] cugain= new int[gain.length+1];
        cugain[0]=0;
        for(int i=1;i<gain.length+1;i++){
            cugain[i]=cugain[i-1]+gain[i-1];
        }
        int max=cugain[0];
        for(int i=0;i<gain.length+1;i++){
            if(cugain[i]>max)max=cugain[i];
        }
        return max;
    }
} {
  
}
