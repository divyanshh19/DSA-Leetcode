class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(candidates);
        CombSum(0 , target ,candidates , ans , ds);
        return ans;
    }
    private void CombSum(int ind , int target ,int[] candidates ,List<List<Integer>> ans , List<Integer> ds){
        if(target == 0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind;i < candidates.length;i++){
            if(i > ind && candidates[i] == candidates[i - 1]){
                continue;
            }
            if(candidates[i] > target){
                break;
            }

            if(candidates[i] <= target){
                //pick current element
                ds.add(candidates[i]);
                CombSum(i + 1 ,target - candidates[i] ,candidates , ans , ds);
                //backtrack
                ds.remove(ds.size() - 1);
            }
        }
    }
}