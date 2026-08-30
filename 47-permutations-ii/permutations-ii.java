class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums, ds , ans,freq);
        return ans;
    }
    private void recurPermute(int[] nums,List<Integer> ds ,List<List<Integer>> ans ,boolean[] freq){
        if(ds.size() == nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i < nums.length;i++){
            if(i > 0 && nums[i] == nums[i - 1] && !freq[i - 1]) continue;
            if(!freq[i]){
                freq[i] = true;
                ds.add(nums[i]);
                recurPermute(nums, ds ,ans , freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
}