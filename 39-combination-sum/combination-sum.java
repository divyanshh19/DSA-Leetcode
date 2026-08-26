class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> ds = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findComb(0 , candidates , target, ans , ds);
        return ans;
    }
    private void findComb(int index , int[] candidates , int target , List<List<Integer>> ans,ArrayList<Integer> ds)
    {
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        if(candidates[index] <= target){
            ds.add(candidates[index]);
            findComb(index , candidates, target - candidates[index], ans , ds);
            ds.remove(ds.size() - 1);
        }
        findComb(index + 1, candidates , target , ans , ds);
    }
}