class Solution {
    public double average(int[] salary) {
        double sum=0;
        int min=salary[0];
        int max=salary[0];
        for(int i=0;i<salary.length;i++){
            sum+=salary[i];
            if(salary[i]<min)min=salary[i];
            if(salary[i]>max)max=salary[i];
        }
        sum=sum-min-max;
        double avg=sum/(salary.length-2);
        return avg;
    }
}