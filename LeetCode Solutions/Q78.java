class Solution {
    List<List<Integer>> res=new ArrayList<>();
    List<Integer> subset=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        backtrack(nums, 0);
        return res;
    }
    public void backtrack(int[] nums, int index){
        res.add(new ArrayList<>(subset));
        for(int i=index;i<nums.length;i++){
            subset.add(nums[i]);
            backtrack(nums, i+1);
            subset.removeLast();
        }
    }
}