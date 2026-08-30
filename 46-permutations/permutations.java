class Solution {
    public List<List<Integer>> permute(int[] nums) {
    //     ArrayList<Integer> up = new ArrayList<>();
    //     for(int n : nums){
    //         up.add(n);
    //     }
    //     return permutation(new ArrayList<>() , up);
    // }
    // public List<List<Integer>> permutation(ArrayList<Integer> p ,ArrayList<Integer> up){
    //     if(up.isEmpty()){
    //         ArrayList<List<Integer>> list = new ArrayList<>();
    //         list.add(p);
    //         return list;
    //     }
    //     int idx = up.get(0);
    //     ArrayList<List<Integer>> ans = new ArrayList<>();
    //     for(int i = 0;i <= p.size();i++){
    //         ArrayList<Integer> fir = new ArrayList(p.subList(0 , i)); 
    //         ArrayList<Integer> sec = new ArrayList(p.subList(i , p.size()));

    //         ArrayList<Integer> curr = new ArrayList<>();
    //         curr.addAll(fir);
    //         curr.add(idx);
    //         curr.addAll(sec);
    //         ans.addAll(permutation(curr , new ArrayList<>(up.subList(1 , up.size()))));
    //     }
    //     return ans;
    //Recursion -

    // List<List<Integer>> ans = new ArrayList<>();
    // List<Integer> ds = new ArrayList<>();
    // boolean[] freq = new boolean[nums.length];
    // recurPermute(nums , ds , ans, freq);
    // return ans;
    // }
    // public void recurPermute(int[] nums , List<Integer> ds , List<List<Integer>> ans , boolean[] freq){
    //     if(ds.size() == nums.length){
    //         ans.add(new ArrayList<>(ds));
    //         return;
    //     }

    //     for(int i = 0; i < nums.length;i++){
    //         if(!freq[i]){
    //             //first make the true in boolean array for adding an element
    //             freq[i] = true;
    //             //add the element
    //             ds.add(nums[i]);
    //             //explore the others
    //             recurPermute(nums , ds , ans, freq);
    //             //backtrack
    //             ds.remove(ds.size() - 1);
    //             //make the false in boolean array for current element
    //             freq[i] = false;
    //         }
    //     }
    //Swapping 
    List<List<Integer>> ans = new ArrayList<>();
    recurPermute(0 , ans ,nums );
    return ans;
    }
    private void recurPermute(int ind ,List<List<Integer>> ans, int[] nums ){
        if(ind == nums.length){
            List<Integer> ds = new ArrayList<>();
            for(int i = 0;i < nums.length;i++){
                ds.add(nums[i]);
            }
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = ind; i < nums.length;i++){
            swap(i , ind ,nums);
            recurPermute(ind + 1, ans, nums );
            swap(i , ind ,nums);
        }
    }
    private void swap(int i ,int ind ,int[] nums){
        int temp = nums[i];
        nums[i] = nums[ind];
        nums[ind] = temp;
    }
}