class Solution {
    static void backtrack(int[] candidates, int target, int index, List<Integer>comb,    List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(comb));
            return;
        }
        if(target<0 || index>=candidates.length)return;
        if(candidates[index]<=target){
            comb.add(candidates[index]);
            backtrack(candidates, target-candidates[index], index, comb, res);
            comb.remove(comb.size()-1);
        }
            backtrack(candidates, target, index+1, comb, res);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
     List<List<Integer>> res=new ArrayList<>();
     backtrack(candidates, target, 0, new ArrayList<>(), res);
     return res;   
    }
} 
