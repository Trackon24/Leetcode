class Solution {
    public int calPoints(String[] operations) {
        int[] record=new int[operations.length];
        int j=0;
        for(int i=0;i<operations.length;i++){
            switch(operations[i]){
                case "C":
                j--;
                break;
                case "D":
                record[j]=record[j-1]*2;
                j++;
                break;
                case "+":
                record[j]=record[j-1]+record[j-2];
                j++;
                break;
                default:
                record[j++]=Integer.parseInt(operations[i]);
                break;
            }
        }
        int total=0;
        for(int i=0;i<j;i++){
            total+=record[i];
        }
        return total;
    }
}