class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        sub(0 , nums , ans ,ds);
        return ans;
    }
    private void sub(int index, int[] nums,List<List<Integer>> ans , List<Integer> ds){
        ans.add(new ArrayList<>(ds));
        for(int i = index;i < nums.length;i++){
            if(i != index && nums[i] == nums[i - 1]) continue;
            //pick the element
            ds.add(nums[i]);
            sub(i + 1,nums , ans , ds);
            //backtrack and not pick
            ds.remove(ds.size() - 1);
        }
    }
}