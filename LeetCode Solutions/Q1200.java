class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res=new ArrayList();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int range=max-min+1;
        boolean[] p=new boolean[range];
        for(int i=0;i<arr.length;i++)p[arr[i]-min]=true;
        int diff=range;
        for(int i=0;i<range;){
            int prev=i++;
            while(i<range && !p[i])i++;
            if(i==range)break;
            int d=i-prev;
            if(d<diff){
                diff=d;
                res.clear();
            }
            if(d==diff){
                List<Integer> pairs=new ArrayList<>();
                pairs.add(prev+min);
                pairs.add(i+min);
                res.add(pairs);
            }
        }
        return res;
    }
}