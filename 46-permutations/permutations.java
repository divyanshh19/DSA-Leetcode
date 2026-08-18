class Solution {
    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> up = new ArrayList<>();
        for(int n : nums){
            up.add(n);
        }
        return permutation(new ArrayList<>() , up);
    }
    public List<List<Integer>> permutation(ArrayList<Integer> p ,ArrayList<Integer> up){
        if(up.isEmpty()){
            ArrayList<List<Integer>> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int idx = up.get(0);
        ArrayList<List<Integer>> ans = new ArrayList<>();
        for(int i = 0;i <= p.size();i++){
            ArrayList<Integer> fir = new ArrayList(p.subList(0 , i)); 
            ArrayList<Integer> sec = new ArrayList(p.subList(i , p.size()));

            ArrayList<Integer> curr = new ArrayList<>();
            curr.addAll(fir);
            curr.add(idx);
            curr.addAll(sec);
            ans.addAll(permutation(curr , new ArrayList<>(up.subList(1 , up.size()))));
        }
        return ans;
    }
}