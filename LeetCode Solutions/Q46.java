class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null) {
            return res;
        }
      permute(nums,0,nums.length-1,res);
      return res;
    }
    public void permute(int[] nums, int left, int right, List<List<Integer>> res){
        if(left==right){
            List<Integer> sub=new ArrayList<>();
            for(int j:nums){
                sub.add(j);
            }
            res.add(sub);
            return;
        }
        for(int i=left;i<=right;i++){
            swap(nums,left,i);
            permute(nums,left+1,right,res);
            swap(nums,left,i);
        }
    }
    private void swap(int[] nums, int left, int right){
        int temp=nums[left];
        nums[left]=nums[right];
        nums[right]=temp;
    }
}