class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        subset(0 , ls,nums , ans);
        return ans;
    }
    public void subset(int index ,List<Integer> ls,int[] nums, List<List<Integer>> ans){
        //Base case here
        if(index == nums.length){
            ans.add(new ArrayList<>(ls));
            return;
        }
        //take 
        ls.add(nums[index]);
        subset(index + 1, ls , nums,ans);
        //backtrack
        ls.remove(ls.size() - 1);
        //don't Take
        subset(index + 1,ls , nums, ans);
    }
}