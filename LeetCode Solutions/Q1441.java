class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> li=new ArrayList<>();
        int i=0;
        for(int j=1;j<=n && i<target.length;j++){
            li.add("Push");
            if(target[i]==j)i++;
            else li.add("Pop");
        }
        return li;
    }
}